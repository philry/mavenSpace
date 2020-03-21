package com.itany.maven;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestHello{
	
	@Test
	public void test(){
		HelloMaven hm = new HelloMaven();
		String result = hm.sayHello();
		assertEquals("Hello Maven!",result);
	}	
	
}