package com.pa.globalbanck.observer;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.logging.Logger;

@ApplicationScoped
public class PruebaObservador {

    private static final Logger LOGGER = Logger.getLogger("Listener Bean");
    void onStart(@Observes StartupEvent startupEvent) {
        LOGGER.info("Se inicio la aplicación ....");
    }

    void onStop(@Observes ShutdownEvent shutdownEvent) {
        LOGGER.info("Se finalizo la aplicación ....");

    }
}
