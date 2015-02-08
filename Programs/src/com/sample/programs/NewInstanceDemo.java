package com.sample.programs;

public class NewInstanceDemo {

	public static void main(String[] args) throws Exception{
		Class ref = Class.forName("NewInstanceDemo");
		NewInstanceDemo obj = (NewInstanceDemo) ref.newInstance();
		obj.print();
	}
	
	public void print(){
		System.out.println("Creating Object without new operator !!");
	}
	
	

}
