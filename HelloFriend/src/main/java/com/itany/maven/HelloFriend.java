package com.itany.maven;

public class HelloFriend {
    public String sayHelloToFriend(String name){
        HelloMaven hm=new HelloMaven();
        String result=hm.sayHello()+"I am "+name;
        return result;
    }
}
