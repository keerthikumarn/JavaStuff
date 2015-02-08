package com.strategypattern.demo;

public class InternetBankingPaymentStrategy implements PaymentStrategy{
	
	private String emailId;
	private String password;
	
	public InternetBankingPaymentStrategy(String emailId, String password){
		this.emailId = emailId;
		this.password = password;
	}

	@Override
	public void makePayment(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}
	
}
