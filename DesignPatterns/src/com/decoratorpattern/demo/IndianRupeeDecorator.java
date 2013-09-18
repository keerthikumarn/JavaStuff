package com.decoratorpattern.demo;

public class IndianRupeeDecorator extends CurrencyDecorator {
	
	Currency currency;
	
	public IndianRupeeDecorator(Currency currency){
		this.currency = currency;
	}

	@Override
	public String getDescription() {
		return currency.getCurrencyDescription()+", is Indian Rupee";
	}

	@Override
	public double cost(double value) {
		return 0;
	}

}
