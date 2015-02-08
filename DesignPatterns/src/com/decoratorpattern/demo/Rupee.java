package com.decoratorpattern.demo;

public class Rupee extends Currency{

	double value;
	
	public Rupee(){
		description = "Indian Rupee";
	}
	
	@Override
	public double cost(double v) {
		value = v;
		return value;
	}

}
