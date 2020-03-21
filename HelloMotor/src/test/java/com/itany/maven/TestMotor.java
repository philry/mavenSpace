package com.itany.maven;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestMotor {
    @Test
    public void TestMotor(){
       HelloMotor hm=new HelloMotor();
       String result=hm.sayHi("admin","Motor");
       assertEquals("Hello Maven!I am admin,I am Motor",result);
    }
}
