package com.decoratorpattern.demo;

public class VegPizza implements Pizza {

	@Override
	public String makePizza() {
		return "Veg Pizza !!";
	}

}
