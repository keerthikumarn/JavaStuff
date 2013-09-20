package com.sample.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringFrequency {

	public static void main(String[] args) {
		String str = "keerthi kumar";
		List<String> list = Arrays.asList(str.split(""));
		
		Set<String> uniqueWords = new HashSet<String>(list);
		
		for(String word : uniqueWords){
			System.out.println(word +" : "+Collections.frequency(list, word));
		}
		
	}

}
