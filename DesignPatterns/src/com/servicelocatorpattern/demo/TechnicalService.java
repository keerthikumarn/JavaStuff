package com.servicelocatorpattern.demo;

public class TechnicalService implements MyService {

	@Override
	public String getServiceName() {
		return "TECHSERVICE";
	}

	@Override
	public void execute() {
		System.out.println("Executing Technical Service");
	}

}
