package controllers;

import service.EmailSender;
import service.TrafficImageGeneratorHelper;
import service.SalesforceHelper;
import service.UpdateSalesforce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Map;

/**
 * Created by Murthy Kavali
 * Date 12/8/15.
 */

@Path("/traffic")
public class DashboardRestAPI {
/*
    @GET
    @Path("/{name}")
    public String helloWorld(@PathParam("name") String name) {
        String response = "Hello world! My name is " + name;
        return response;
    }
*/

    @GET
    @Path("/")
    public String updateCountByOne() {
        UpdateSalesforce.update(SalesforceHelper.getContext(false));
        return "<html><head></head><body><h2>Thank you.</h2></body></html>";
    }

    @GET
    @Path("/read")
    public Map<String, Object> getTraffic() {
        return UpdateSalesforce.querySF(SalesforceHelper.getContext(false));
    }

    @GET
    @Path("/export")
    public String getImage() {
        return TrafficImageGeneratorHelper.getImagePath();
    }

    @GET
    @Path("/getSnapshot")
    public Boolean getSnapshot(){
        EmailSender.send(TrafficImageGeneratorHelper.getImagePath());
        return true;
    }
}
