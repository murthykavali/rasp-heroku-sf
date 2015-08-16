package util;

/**
 * Created by Murthy Kavali
 * Date 16/8/15.
 */
public class SalesforceContext {

    private static String instanceUrl;
    private static String accessToken;


    public SalesforceContext() {

    }

    public SalesforceContext(String instanceUrl, String accessToken) {
        this.instanceUrl = instanceUrl;
        this.accessToken = accessToken;
    }

    public String getInstanceUrl() {
        return instanceUrl;
    }

    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "ApplicationContext{" +
                "instanceUrl='" + instanceUrl + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
