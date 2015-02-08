package com.decoratorpattern.demo;

public class PizzaDecorator implements Pizza {
	
	protected Pizza pizza;

	public PizzaDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String makePizza() {
		return pizza.makePizza();
	}

}
