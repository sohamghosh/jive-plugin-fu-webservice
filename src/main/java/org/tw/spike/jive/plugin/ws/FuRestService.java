package org.tw.spike.jive.plugin.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


public interface FuRestService {

    @GET
    @Path("/test")
    @Produces(APPLICATION_JSON)
    Response test();

    @POST
    @Path("/testp")
    @Produces(APPLICATION_JSON)
    Response testp();

    @GET
    @Path("/user")
    @Produces(APPLICATION_JSON)
    User user();

    @POST
    @Path("/userx")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    Response user(User user);
}
