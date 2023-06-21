package com.pa.globalbanck;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FintechResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/fintech")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}