package com.sample.programs;

public class Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		double randomNum = Math.random();
		
		int newNum = (int) (randomNum * n);
		
		System.out.println(newNum);
	}

}
