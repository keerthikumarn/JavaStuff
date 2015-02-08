package com.sample.programs;

public class DivisorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 20;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i % j == 0 || j % i == 0) {
                    System.out.print("* "); 
                }
                else {
                    System.out.print("  "); 
                }
            }
            System.out.println(i);
        }

	}

}
