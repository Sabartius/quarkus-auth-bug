package de.sabartius.quarkus.auth;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/api/declarative")
public class MyDeclarativeResource {

    @POST
    public String postIt(final MyBody body) {
        return body.text;
    }
}
