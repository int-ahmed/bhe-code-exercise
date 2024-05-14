package org.intesar;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(PrimeResource.class)
class PrimeResourceTest {
    @Test
    void testPrimeEndpoint_10() {
        given()
                .when().get("/10")
                .then()
                .statusCode(200)
                .body(is("2 3 5 7"));
    }

    @Test
    void testPrimeEndpoint_13() {
        given()
                .when().get("/13")
                .then()
                .statusCode(200)
                .body(is("2 3 5 7 11"));
    }

}