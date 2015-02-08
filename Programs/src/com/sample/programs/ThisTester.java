package com.sample.programs;

public class ThisTester {

	public int num = 10;

	public void print() {
		System.out.println("Local var : " + num);
		System.out.println("Global var : " + this.num);
	}

	public static void main(String[] args) {
		ThisTester t = new ThisTester();
		t.print();
	}

}
