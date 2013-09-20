package com.sample.programs;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your height in centimeters : ");
		float height = scan.nextFloat();
		System.out.println("Enter your weight in kilograms : ");
		float weight = scan.nextFloat();
		float bmi = weight / (height * height) * 10000;
		System.out.println(bmi);
	}
}
