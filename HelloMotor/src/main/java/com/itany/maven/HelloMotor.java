package com.itany.maven;

public class HelloMotor {
    public String sayHi(String name,String name2){
        HelloFriend hf=new HelloFriend();
        String result=hf.sayHelloToFriend(name)+",I am "+name2;
        return result;
    }
}
