package de.sabartius.quarkus.auth;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.security.TestSecurity;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;

@QuarkusTest
class MyDeclarativeResourceTest {

    @TestSecurity(user = "isabell", roles = {"User"})
    @Test
    void runsAuth() {
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body("{}")
                .post("/api/declarative")
                .then()
                .statusCode(400);
    }

    @TestSecurity(user = "isabell", roles = {"nouser"})
    @Test
    void runsNoAuth() {
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body("{}")
                .post("/api/declarative")
                .then()
                .statusCode(403);
    }

    @Test
    void runs() {
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body("{}")
                .post("/api/declarative")
                .then()
                .statusCode(401);
    }
}