package com.itany.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/13 14:59
 * Description:
 * version:1.0
 */
public class TestHello {

    @Test
    public void test(){
        HelloMaven hm = new HelloMaven();
        String result = hm.sayHello();
        assertEquals("Hello Maven!",result);
    }

}
