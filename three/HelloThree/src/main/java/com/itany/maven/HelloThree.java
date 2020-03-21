package com.itany.maven;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/13 15:14
 * Description:
 * version:1.0
 */
public class HelloThree {

    public String sayThree(){
        HelloFriend hf = new HelloFriend();
        String result = hf.sayHelloToFriend("admin")+", I am three";
        return result;
    }

}
