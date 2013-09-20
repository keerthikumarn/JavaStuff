package com.sample.programs;

public class PowersOfTwo {

	public static void main(String[] args) {
		int num = 5;
		
		int i = 0;
		int powerOfTwo = 1;
		
		while(i < num){
			System.out.println(i + " "+ powerOfTwo);
			powerOfTwo =  2 * powerOfTwo;
			i++;
		}
	}

}
