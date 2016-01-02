package com.tonyganchev.blog.karaf.c;

import com.tonyganchev.blog.karaf.a.GreetingService;

public class GreetingSender {
	public GreetingSender(final GreetingService greetingService) {
		greetingService.greet("Hello from a Blueprint bean!");
	}
}