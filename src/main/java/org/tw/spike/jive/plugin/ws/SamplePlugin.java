package org.tw.spike.jive.plugin.ws;

import com.jivesoftware.base.plugin.Plugin;

public class SamplePlugin implements Plugin {


    @Override
    public void initPlugin() {
        System.out.println("Init ----------- TestWS plugin.");
    }

    @Override
    public void destroy() {

    }
}
