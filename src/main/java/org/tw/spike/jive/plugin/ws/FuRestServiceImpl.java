package org.tw.spike.jive.plugin.ws;

import net.sf.json.JSONObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * @see com.jivesoftware.community.webservices.rest.ErrorBuilder
 */
public class FuRestServiceImpl implements FuRestService {

    @Override
    public Response test() {
        JSONObject result = new JSONObject();
        result.put("response", "GET working");
        return Response.ok(result.toString()).build();
    }

    @Override
    public Response testp() {
        JSONObject result = new JSONObject();
        result.put("response", "POST working");
        return Response.ok(result.toString()).build();
    }

    @Override
    public User user() {
        User user = new User();
        user.setName("Android");
        user.setCity("Dalvik");
        return user;
    }

    @Override
    public Response user(User user) {
        System.out.println(user);

        JSONObject result = new JSONObject();
        result.put("response", "User created successfully");
        return Response.ok(result.toString()).build();
    }
}
