package ma.emsi.jaxrs.configs;

import ma.emsi.jaxrs.controllers.CompteRestJaxRSAPI;
import ma.emsi.jaxrs.providers.CompteListWrapperMessageBodyWriter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class);
        jerseyServlet.register(CompteListWrapperMessageBodyWriter.class);
        return jerseyServlet;
    }
}
