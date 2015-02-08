package com.sample.programs;

public class OperatorTest {

	public static void main(String[] args) {
		OperatorTest test = new OperatorTest();
		int x = 50;
		
		if(x > 0 & test.returnBoolean()){
			System.out.println("&&");
		}
		
		if(x > 0 && x < 100){
			System.out.println("&");
		}
	}
	
	private boolean returnBoolean(){
		System.out.println("Inside returnBoolean");
		return true;
	}

}
