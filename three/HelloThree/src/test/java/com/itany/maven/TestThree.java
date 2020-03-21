package com.itany.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/13 15:18
 * Description:
 * version:1.0
 */
public class TestThree {


    @Test
    public void test(){
        HelloThree ht = new HelloThree();
        String result = ht.sayThree();
        assertEquals("Hello Maven!I am adimn,I am three",result);
    }

}
