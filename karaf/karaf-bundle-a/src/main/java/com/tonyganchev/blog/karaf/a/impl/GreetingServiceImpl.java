package com.tonyganchev.blog.karaf.a.impl;

import com.tonyganchev.blog.karaf.a.GreetingService;

public class GreetingServiceImpl implements GreetingService {
	@Override
	public void greet(final String greeting) {
		System.out.println("Greeting: " + greeting);
	}

}
