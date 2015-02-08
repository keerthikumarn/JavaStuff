package com.sample.programs;

import java.util.ArrayList;

public class DoubleBrace {
	public static void main(String[] ar){
		processList(new ArrayList<String>(){{
				add("keerthi");
				add("kumar");
				add("raghav");
				add("nayak");
			}
		});
	}
	
	private static void processList(ArrayList<String> list){
		for(String str : list){
			System.out.println(str);
		}
	}
}
