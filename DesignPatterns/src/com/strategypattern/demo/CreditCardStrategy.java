package com.strategypattern.demo;

public class CreditCardStrategy implements PaymentStrategy{
	
	private String name;
    private String cardNumber;
    private String cvvNum;
    private String dateOfExpiry;
    
    public CreditCardStrategy(String name, String ccNum, String cvvNum, String dateOfExpiry){
        this.name = name;
        this.cardNumber = ccNum;
        this.cvvNum = cvvNum;
        this.dateOfExpiry = dateOfExpiry;
    }

	@Override
	public void makePayment(int amount) {
		System.out.println("amount "+" paid with credit/debit card");
	}

}
