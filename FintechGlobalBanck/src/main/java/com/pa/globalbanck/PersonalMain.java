package com.pa.globalbanck;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class PersonalMain {
    public static void main(String ... args){
        Quarkus.run(PersonalApp.class, args);
    }

    public static class PersonalApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Inicio Personalizado");
            Quarkus.waitForExit();
            return 0;
        }
    }
}
