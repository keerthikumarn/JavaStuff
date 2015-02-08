package com.sample.programs;

import java.lang.reflect.Field;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws Exception {
		String str = "keerthi";
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.intern());
		
		String subStr = str.substring(1, 4);
		System.out.println(subStr);
		
		Field innerCharArray = String.class.getDeclaredField("value");
		innerCharArray.setAccessible(true);
		char[] chars = (char[]) innerCharArray.get(str);
		System.out.println(Arrays.toString(chars));
		
	}

}
