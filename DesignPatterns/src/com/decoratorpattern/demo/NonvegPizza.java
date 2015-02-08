package com.decoratorpattern.demo;

public class NonvegPizza implements Pizza {

	@Override
	public String makePizza() {
		return "Non Veg Pizza !!";
	}

}
