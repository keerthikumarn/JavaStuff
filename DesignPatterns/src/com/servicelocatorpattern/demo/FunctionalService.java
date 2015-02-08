package com.servicelocatorpattern.demo;

public class FunctionalService implements MyService{

	@Override
	public String getServiceName() {
		return "FUNCSERVICE";
	}

	@Override
	public void execute() {
		System.out.println("Executing Functional Service..");
	}

}
