package com.pa.globalbanck;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/fintech")
public class FintechResource {
    @ConfigProperty(name ="saludo.mensaje")
    String saludo;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return saludo;
    }
}
