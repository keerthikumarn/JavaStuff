package com.servicelocatorpattern.demo;

public class ServiceLocatorPatternDemo {

	public static void main(String[] args) {
		MyService service = MyServiceLocator.getService("TECHSERVICE");
	      service.execute();
	      service = MyServiceLocator.getService("FUNCSERVICE");
	      service.execute();
	      service = MyServiceLocator.getService("TECHSERVICE");
	      service.execute();
	      service = MyServiceLocator.getService("FUNCSERVICE");
	      service.execute();	
	}

}
