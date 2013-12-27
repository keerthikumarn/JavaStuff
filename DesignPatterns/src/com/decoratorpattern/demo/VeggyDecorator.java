package com.decoratorpattern.demo;

public class VeggyDecorator extends PizzaDecorator {

	public VeggyDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String makePizza(){
		return pizza.makePizza() + addExtraPaneer();
	}
	
	private String addExtraPaneer(){
		return " with extra paneer !!";
	}

}
