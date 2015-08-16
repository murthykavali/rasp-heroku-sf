package service;

import java.io.IOException;
import java.util.Map;

public interface SalesforceRestService {
    Map getAggregatedRecords(String query);

    void patch(String url, String auth, Map object) throws IOException;

    <T> T get(String queryUrl, String query, String authToken, Class<T> classObject);

    <O, T> Map post(String targetUrl, String oAuthToken, O object, Class<T> classObject);

    Map query(String query, String queryUrl, String sessionId) throws Exception;
}