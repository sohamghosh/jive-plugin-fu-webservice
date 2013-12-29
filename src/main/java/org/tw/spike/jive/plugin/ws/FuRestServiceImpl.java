package org.tw.spike.jive.plugin.ws;

import net.sf.json.JSONObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see com.jivesoftware.community.webservices.rest.ErrorBuilder
 */
public class FuRestServiceImpl implements FuRestService {

    private static List<User> users = new ArrayList<User>();

    static {
        users.add(new User("Soham", "Mumbai"));
        users.add(new User("Rob", "Delhi"));
        users.add(new User("Jane", "Bangalore"));
    }

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
    public List<User> user() {
        return users;
    }

    @Override
    public User user(User user) {
        users.add(user);
        return user;
    }
}
