package service;

import jersey.repackaged.com.google.common.collect.Maps;
import org.joda.time.DateTime;
import util.Constants;
import util.SalesforceContext;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by Murthy Kavali
 * Date 12/8/15.
 */
public class UpdateSalesforce {


    public static void update(SalesforceContext context) {
        Map<String, Object> response = getResponse(context);
        if (response.get("success") != true) {
            //Re-generating session Id
            SalesforceContext regeneratedContext = SalesforceHelper.getContext(true);
            getResponse(regeneratedContext);
        }
    }

    private static Map<String, Object> getResponse(SalesforceContext context) {

        String targetUrl = context.getInstanceUrl() + Constants.UPDATE_END_URL;
        String oAuth = context.getAccessToken();
        SalesforceRestServiceImpl salesforceRestService = new SalesforceRestServiceImpl();
        Map<String, String> map = Maps.newHashMap();
        map.put("hitcount__c", "1");
        map.put("timestamp__c", System.currentTimeMillis() + "");
        Map<String, Object> post = salesforceRestService.post(targetUrl, oAuth, map, Map.class);
        return post;
    }


    public static Map querySF(SalesforceContext context) {
        String queryUrl = context.getInstanceUrl() + Constants.QUERY_END_URL;
        SalesforceRestServiceImpl salesforceRestService = new SalesforceRestServiceImpl();
        Map map = null;
        try {
            map = salesforceRestService.query(populateQuery(), queryUrl, context.getAccessToken());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    private static String populateQuery() {

        DateTime dateTime = DateTime.now().minusMinutes(2);
        String twoMinAgo = Constants.SFDC_TIME_FORMAT.print(dateTime);
        String query = "SELECT HitCount__c,TimeStamp__c FROM Traffic__c WHERE TimeStamp__c > %s";
        return String.format(query, twoMinAgo);
    }
}
