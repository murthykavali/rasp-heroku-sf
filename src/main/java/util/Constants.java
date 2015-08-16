package util;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by Murthy Kavali
 * Date 16/8/15.
 */
public class Constants {
    public static final String SALESFORCE_AUTH_URL = "https://login.salesforce.com/services/oauth2/token";
    public static final String QUERY_END_URL = "/services/data/v20.0/query";
    public static final String UPDATE_END_URL = "/services/data/v22.0/sobjects/Traffic__c";
    public static final String GRANT_TYPE = "grant_type";
    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_SECRET = "client_secret";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String INSTANCE_URL = "instance_url";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String EMAIL = "email";
    public static final String EMAIL_PWD = "emailpwd";

    public static final String DEFAULT_CLIENT_ID = "";
    public static final String DEFAULT_CLIENT_SECRET = "";
    public static final String DEFAULT_USERNAME = "";
    public static final String DEFAULT_PASSWORD = "";




    public static final DateTimeFormatter SFDC_TIME_FORMAT =
            DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'+0000'").withZoneUTC();
}
