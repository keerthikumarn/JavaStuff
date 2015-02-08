package com.strategypattern.demo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	int totalAmount = 0;
	
	public ShoppingCart(){
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public int calculateTotal(){
		for(Item item : items){
			totalAmount += item.getPrice();
		}
		return totalAmount;
	}
	
	public void pay(PaymentStrategy paymentMethod){
		int amount = calculateTotal();
		System.out.println("Total Amount to be paid : "+amount);
		paymentMethod.makePayment(amount);
		System.out.println("Payment Successful");
	}
	
}
