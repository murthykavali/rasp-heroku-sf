package service;

import org.apache.commons.lang3.StringUtils;
import util.Constants;

/**
 * Created by Murthy Kavali
 * Date 16/8/15.
 */
public class SystemProperties {
    public static String getClientId() {
        String clientId = System.getenv(Constants.CLIENT_ID);
        if (StringUtils.isBlank(clientId)) {
            return Constants.DEFAULT_CLIENT_ID;
        }
        return clientId;
    }

    public static String getClientSecret() {
        String clientSecret = System.getenv(Constants.CLIENT_SECRET);
        if (StringUtils.isBlank(clientSecret)) {
            return Constants.DEFAULT_CLIENT_SECRET;
        }
        return clientSecret;
    }

    public static String getUserName() {
        String userName = System.getenv(Constants.USERNAME);
        if (StringUtils.isBlank(userName)) {
            return Constants.DEFAULT_USERNAME;
        }
        return userName;
    }

    public static String getPassWord() {
        String password = System.getenv(Constants.PASSWORD);
        if (StringUtils.isBlank(password)) {
            return Constants.DEFAULT_PASSWORD;
        }
        return password;
    }

}
