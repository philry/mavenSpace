package com.itany.maven;

import com.itany.maven.HelloMaven;

public class HelloFriend{
	
	public String sayHelloToFriend(String name){
		HelloMaven hm = new HelloMaven();
		String result = hm.sayHello()+"I am "+name;
		return result;
	}
	
}