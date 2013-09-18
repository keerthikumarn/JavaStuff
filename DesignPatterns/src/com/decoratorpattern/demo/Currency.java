package com.decoratorpattern.demo;

public abstract class Currency {
	String description = "Uknown Currency";
	
	public String getCurrencyDescription() {
		return description;
	}
	
	public abstract double cost(double value);
}
