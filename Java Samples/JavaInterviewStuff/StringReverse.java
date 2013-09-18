package com.sample.programs;

public class StringReverse {
	public static void main(String[] ar){
		String originalString = "keerthi kumar";
		
		String reversedString = reversedString(originalString);
		
		System.out.println("Originial String : "+originalString);
		System.out.println("Reversed String : "+reversedString);
		
	}
	
	public static String reversedString(String str){
		String reversedStr = "";
		for(int i = str.length(); i>0; i--){
			reversedStr+= str.charAt(i-1);
		}
		return reversedStr;
	}
}
