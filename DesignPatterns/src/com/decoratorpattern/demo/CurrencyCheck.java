package com.decoratorpattern.demo;

public class CurrencyCheck {

	public static void main(String[] args) {
		Currency curr = new Rupee();
		System.out.println(curr.getCurrencyDescription()+" ruppe. "+curr.cost(3.0));
		
		//adding decorator
		
		Currency curr2 = new IndianRupeeDecorator(new Rupee());
		System.out.println(curr2.getCurrencyDescription()+" Indian Rupee. "+curr2.cost(5.0));
	}

}
