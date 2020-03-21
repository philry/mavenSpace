package com.itany.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFriend {
    @Test
    public void Test(){
        HelloFriend hf=new HelloFriend();
        String result=hf.sayHelloToFriend("admin");
        assertEquals("Hello Maven!I am admin",result);
    }
}
