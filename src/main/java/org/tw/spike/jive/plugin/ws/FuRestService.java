package org.tw.spike.jive.plugin.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Consumes("application/json")
@Produces("application/json")
public interface FuRestService {

    @GET
    @Path("/test")
    String test();

    @GET
    @Path("/test/response")
    Response testResponse();

    @POST
    @Path("/submit")
    Response submit(User user);
}
