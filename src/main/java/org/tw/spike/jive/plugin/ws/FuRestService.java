package org.tw.spike.jive.plugin.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
public interface FuRestService {

    @GET
    @Path("/test")
    Response test();

    @POST
    @Path("/testp")
    Response testp();

    @GET
    @Path("/user")
    User user();

    @POST
    @Path("/userx")
    @Consumes(APPLICATION_JSON)
    Response user(User user);
}
