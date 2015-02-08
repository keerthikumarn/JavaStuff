package com.servicelocatorpattern.demo;

import java.util.ArrayList;
import java.util.List;

public class CacheHandler {
	private List<MyService> services;

	public CacheHandler() {
		services = new ArrayList<MyService>();
	}

	public MyService getService(String serviceName) {
		for (MyService service : services) {
			if (service.getServiceName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached  " + serviceName
						+ " object");
				return service;
			}
		}
		return null;
	}

	public void addService(MyService newService) {
		boolean exists = false;
		for (MyService service : services) {
			if (service.getServiceName().equalsIgnoreCase(
					newService.getServiceName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}
