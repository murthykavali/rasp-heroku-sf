package service;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.TypeReference;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyInvocation;
import org.glassfish.jersey.client.JerseyWebTarget;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class SalesforceRestServiceImpl implements SalesforceRestService {
    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer";
    public final static String SPACE = " ";


    @Override
    public Map getAggregatedRecords(String query) {
        return null;
    }

    @Override
    public <T> T get(String queryUrl, String query, String authToken, Class<T> classObject) {
        return null;
    }


    @Override
    public <O, T> Map post(String targetUrl, String oAuthToken, O object, Class<T> classObject) {
        if (StringUtils.isNotEmpty(targetUrl)) {
            JerseyClient client = JerseyClientBuilder.createClient();
            client.register(JacksonFeature.class);
            JerseyWebTarget target = client.target(targetUrl);
            JerseyInvocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
            builder.header(AUTHORIZATION, BEARER + SPACE + oAuthToken);
            javax.ws.rs.core.Response response = firePostRequest(object, builder);
            try {
                ObjectMapper mapper = new ObjectMapper();
                String jsonString = response.readEntity(String.class);
                Map resultMap = mapper.readValue(jsonString, new TypeReference<HashMap<String, Object>>() {
                });
                return resultMap;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // TODO Have not decided what i should do throw exception or etc.
            return null;
        }
        return null;
    }

    @Override
    public void patch(String url, String auth, Map object) throws IOException {

    }

    private <O> javax.ws.rs.core.Response firePostRequest(O object, JerseyInvocation.Builder builder) {
        return builder.accept(MediaType.APPLICATION_JSON_TYPE).post(Entity.json(object));
    }

    @Override
    public Map query(String query, String queryUrl, String sessionId) throws Exception {
        JerseyClient client = JerseyClientBuilder.createClient();
        client.register(JacksonFeature.class);

        JerseyWebTarget target = client.target(queryUrl);
        target = target.queryParam("q", query);

        JerseyInvocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
        builder.header("Authorization", "Bearer " + sessionId);
        Response response;
        try {
            response = builder.accept(MediaType.APPLICATION_JSON_TYPE).get();
            ;
        } catch (Exception e) {
            throw e;
        }

        String str = response.readEntity(String.class);
        return readMap(str, Object.class, Object.class);
    }

    public static <K, V> Map<K, V> readMap(String json, Class<K> keyClass, Class<V> valueClass) throws IOException {
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        MapType mapType = typeFactory.constructMapType(HashMap.class, keyClass, valueClass);
        try {
            return new ObjectMapper().readValue(json, mapType);
        } catch (IOException e) {
            throw e;
        }
    }

}
