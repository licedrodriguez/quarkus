package io.quarkus.workshop.superheroes.villain;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.jboss.resteasy.reactive.RestResponse.StatusCode.NO_CONTENT;

@QuarkusTest
public class VillainResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/villains/hello")
          .then()
             .statusCode(200)
             .body(is("Hello Villain Resource"));
    }

    @Test
    void shouldNotGetUnKnowVillain(){
        Long randomId = new Random().nextLong();
        given()
            .pathParams("id", randomId)
            .when().get("/api/villains/{id}")
            .then()
            .statusCode(NO_CONTENT);
    }

}
