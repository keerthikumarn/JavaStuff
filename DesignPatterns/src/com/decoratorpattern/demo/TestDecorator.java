package com.decoratorpattern.demo;

public class TestDecorator {

	public static void main(String[] args) {
		Pizza vegPizza = new PizzaDecorator(new VeggyDecorator(new VegPizza()));
		System.out.println(vegPizza.makePizza());
		
		Pizza nonVegPizza = new PizzaDecorator(new VeggyDecorator(new NonvegPizza()));
		System.out.println(nonVegPizza.makePizza());
	}

}
