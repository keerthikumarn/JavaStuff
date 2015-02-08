package com.sample.programs;

public class BinaryConversion {

	public static void main(String[] args) {
		int num = 5;
		
		int v = 1;
		while(v <= num / 2){
			v = v * 2;
		}
		
		 // check for presence of powers of 2 in n, from largest to smallest
        while (v > 0) {

            // v is not present in n 
            if (num < v) {
                System.out.print(0);
            }

            // v is present in n, so remove v from n
            else {
                System.out.print(1);
                num = num - v;
            }

            // next smallest power of 2
            v = v / 2;
        }
	}

}
