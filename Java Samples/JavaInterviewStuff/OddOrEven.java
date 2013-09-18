package com.sample.programs;

/**
 * Program to find whether an input no. is ODD/EVEN without using modulus or multiplication operators 
 * @author kenarayan
 *
 */
public class OddOrEven {

	public static void main(String[] args) {
		int a = 13;
		
		String binary1 = Integer.toBinaryString(a);
		
		System.out.println("Binary form of the no. "+a+" is : "+binary1);
		
		if((!((a & 1) == 0))){
			System.out.println(a+ " is Odd Number !");
		}else{
			System.out.println(a+ " is Even Number !");
		}
	}

}

