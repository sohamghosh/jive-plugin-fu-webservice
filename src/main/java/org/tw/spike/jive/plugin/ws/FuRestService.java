package org.tw.spike.jive.plugin.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

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
    List<User> user();

    @POST
    @Path("/user")
    @Consumes(APPLICATION_JSON)
    User user(User user);
}
