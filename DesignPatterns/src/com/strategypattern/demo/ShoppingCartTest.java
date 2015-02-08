package com.strategypattern.demo;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
        
        Item item1 = new Item("3014",10);
        Item item2 = new Item("3010",60);
         
        cart.addItem(item1);
        cart.addItem(item2);
        
        //make payment by credit card
        //cart.pay(new CreditCardStrategy("Keerthi Kumar N", "12345678932658", "554", "12/12/2015"));
        cart.pay(new InternetBankingPaymentStrategy("n.keerthikumar85@gmail.com", "test"));
        		
	}

}
