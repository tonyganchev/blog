package com.tonyganchev.blog.karaf.c.impl;

import com.tonyganchev.blog.karaf.a.GreetingService;
import com.tonyganchev.blog.karaf.c.GreetingSender;

public class GreetingSenderImpl implements GreetingSender {
	@Override
	public void sendGreeting(final String message) {
		greetingService.greet(message);
	}

	public GreetingSenderImpl(final GreetingService greetingService) {
		this.greetingService = greetingService;
		System.out.println("Greeting sender (C) started,");
		sendGreeting("test");
	}

	private final GreetingService greetingService;
}
