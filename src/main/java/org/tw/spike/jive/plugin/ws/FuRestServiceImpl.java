package org.tw.spike.jive.plugin.ws;

import javax.ws.rs.core.Response;

public class FuRestServiceImpl implements FuRestService {

    @Override
    public String test() {
        return "Hola, Mundo!";
    }

    @Override
    public Response testResponse() {
        return Response.ok().entity("Ola, Mundo!").build();
    }

    @Override
    public Response submit(User user) {
        System.out.println(user);
        return Response.ok().build();
    }
}
