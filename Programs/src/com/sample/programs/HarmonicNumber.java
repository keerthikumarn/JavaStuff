package com.sample.programs;

public class HarmonicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 100;
		
		double sum = 0.0;
		
		for(int i=1; i<=num ; i++){
			sum+= 1.0 / i;
		}
		System.out.println(sum);
	}

}
