package com.decoratorpattern.demo;

public class USDollarDecorator extends CurrencyDecorator {

	Currency currency;
	
	public USDollarDecorator(Currency currency){
		this.currency = currency;
	}
	
	@Override
	public String getDescription() {
		return currency.getCurrencyDescription() +", its US Dollar";
	}

	@Override
	public double cost(double value) {
		return 0;
	}

}
