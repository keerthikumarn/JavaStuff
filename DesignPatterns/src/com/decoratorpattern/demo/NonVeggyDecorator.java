package com.decoratorpattern.demo;

public class NonVeggyDecorator extends PizzaDecorator{

	public NonVeggyDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String makePizza(){
		return pizza.makePizza() + addExtraChicken();
	}
	
	private String addExtraChicken(){
		return " with extra chicken";
	}

}
