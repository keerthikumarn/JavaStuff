package com.decoratorpattern.demo;

public class Dollar extends Currency {
	
	double value;
	
	public Dollar(){
		description = "US Dollar";
	}

	@Override
	public double cost(double v) {
		value = v;
		return value;
	}

}
