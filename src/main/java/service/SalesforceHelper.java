package service;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyInvocation;
import org.glassfish.jersey.client.JerseyWebTarget;
import org.glassfish.jersey.jackson.JacksonFeature;
import util.Constants;
import util.SalesforceContext;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Murthy Kavali
 * Date 16/8/15.
 */
public class SalesforceHelper {

    public static SalesforceContext context;

    public static SalesforceContext getContext(boolean force) {
        if (!force && context != null) {
            return context;
        }
        JerseyClient client = JerseyClientBuilder.createClient();
        client.register(JacksonFeature.class);
        JerseyWebTarget target = client.target(Constants.SALESFORCE_AUTH_URL);
        JerseyInvocation.Builder builder = target.request(MediaType.MULTIPART_FORM_DATA_TYPE);

        MultivaluedMap map = new MultivaluedHashMap();

        map.add(Constants.GRANT_TYPE, Constants.PASSWORD);
        map.add(Constants.CLIENT_ID, SystemProperties.getClientId());
        map.add(Constants.CLIENT_SECRET, SystemProperties.getClientSecret());
        map.add(Constants.USERNAME, SystemProperties.getUserName());
        map.add(Constants.PASSWORD, SystemProperties.getPassWord());


        Response response = builder.post(Entity.form(map), Response.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = response.readEntity(String.class);
            Map<String, String> resultMap = mapper.readValue(jsonString, new TypeReference<HashMap<String, Object>>() {
            });

            String accessToken = resultMap.get(Constants.ACCESS_TOKEN);
            String instanceUrl = resultMap.get(Constants.INSTANCE_URL);
            context = new SalesforceContext(instanceUrl, accessToken);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return context;
    }


}
