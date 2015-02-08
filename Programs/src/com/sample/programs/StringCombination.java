package com.sample.programs;


/**
 * Java program to print all the possible combination of an input string
 * 
 * ALGORITHM
 * ---------
 * 1. Start
 * 2. Read the String
 * 3. Find all the combinations of the input string using recursion
 * 4. Print the combinations
 * 5. End
 * 
 * @author kenarayan
 *
 */
public class StringCombination {
	
	static int count = 0;

	public static void main(String[] args) {
		String str = "CARBON";
		findStrCombinations("", str);
	}
	
	public static void findStrCombinations(String begin, String end){
		if(end.length() <= 1){
			System.out.println(begin + end +"---"+count++);
		}else{
			for(int i=0; i < end.length(); i++){
				String newStr = end.substring(0, i) + end.substring(i + 1);
				findStrCombinations(begin + end.charAt(i),newStr); //recursively calling findStrCombinations()
			}
		}
	}
	
}
