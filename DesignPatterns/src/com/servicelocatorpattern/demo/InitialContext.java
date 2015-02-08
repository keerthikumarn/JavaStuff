package com.servicelocatorpattern.demo;

public class InitialContext {
	public Object lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("TECHSERVICE")){
			System.out.println("Looking up and creating a new Technical Service instance");
			return new TechnicalService();
		}
		else if(jndiName.equalsIgnoreCase("FUNCSERVICE")){
			System.out.println("Looking up and creating a new Technical Service instance");
			return new FunctionalService();
		}
		return null;
	}
}
