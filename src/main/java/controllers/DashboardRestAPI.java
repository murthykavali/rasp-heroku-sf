package controllers;


import service.SalesforceHelper;
import service.UpdateSalesforce;
import util.Request;
import util.SalesforceContext;
import service.EmailSender;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
        return "updated counte by one";
    }

    @GET
    @Path("/read")
    public Map<String, Object> getTraffic() {
        return UpdateSalesforce.querySF(SalesforceHelper.getContext(false));
    }

    @POST
    @Path("/getSnapshot")
    public boolean getSnapshot(Request request) {
        EmailSender.main(null);
        return true;
    }


}