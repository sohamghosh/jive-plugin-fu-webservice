package org.tw.spike.jive.plugin.ws;

import javax.ws.rs.core.Response;

public class FuRestServiceImpl implements FuRestService {

    @Override
    public String test() {
        return "Test...!";
    }

    @Override
    public Response testResponse() {
        return Response.ok().entity("Response...!").build();
    }

    @Override
    public Response submit(User user) {
        System.out.println(user);
        return Response.ok().build();
    }

    @Override
    public Response go() {
        return Response.ok().build();
    }
}
