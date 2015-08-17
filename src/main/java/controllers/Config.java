package controllers;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class Config extends ResourceConfig {

    public Config() {

        packages("controllers");
		packages("filters");
        register(JacksonFeature.class);

    }

}