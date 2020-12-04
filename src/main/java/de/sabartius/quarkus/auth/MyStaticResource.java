package de.sabartius.quarkus.auth;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@RolesAllowed("User")
@Path("/api/static")
public class MyStaticResource {

    @RolesAllowed("User")
    @POST
    public String postIt(final MyBody body) {
        return body.text;
    }
}
