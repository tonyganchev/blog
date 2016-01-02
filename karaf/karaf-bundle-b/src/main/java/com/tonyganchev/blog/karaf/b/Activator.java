package com.tonyganchev.blog.karaf.b;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.tonyganchev.blog.karaf.a.GreetingService;

public class Activator implements BundleActivator {
	@Override
	public void start(final BundleContext context) {
		System.out.println("B: Starting the bundle");
		greetingServiceRef = context.getServiceReference(GreetingService.class);
		context.getService(greetingServiceRef).greet("Bundle B started!");
	}

	@Override
	public void stop(final BundleContext context) {
		System.out.println("B: Stopping the bundle");
		context.ungetService(greetingServiceRef);
	}

	private ServiceReference<GreetingService> greetingServiceRef;
}
