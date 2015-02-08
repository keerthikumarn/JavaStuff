package com.sample.programs;

public class RecursiveStringReverse {

	public static String reversedString = "";

	public static void main(String[] args) {
		String originalString = "keerthi kumar";

		String reversedString = recursivelyReversedString(originalString);

		System.out.println("Originial String : " + originalString);
		System.out.println("Reversed String : " + reversedString);

	}

	public static String recursivelyReversedString(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			reversedString += str.charAt(str.length() - 1)
					+ recursivelyReversedString(str.substring(0,
							str.length() - 1));
			return reversedString;
		}
	}

}
