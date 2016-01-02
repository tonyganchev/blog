package com.tonyganchev.blog.karaf.a;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.tonyganchev.blog.karaf.a.impl.GreetingServiceImpl;

public class Activator implements BundleActivator {
	@Override
	public void start(final BundleContext context) {
		System.out.println("A: Starting the bundle");
		serviceRegistration = context
				.registerService(GreetingService.class, new GreetingServiceImpl(), new Hashtable<String, String>());
	}

	@Override
	public void stop(final BundleContext context) {
		System.out.println("A: Stopping the bundle");
		serviceRegistration.unregister();
	}

	private ServiceRegistration<GreetingService> serviceRegistration;

}