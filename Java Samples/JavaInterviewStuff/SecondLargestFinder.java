package com.sample.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SecondLargestFinder {
	public static void main(String[] ar){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(3);
		list.add(6);
		list.add(87);
		list.add(66);
		
		Collections.sort(list);
		
		int index = list.size() - 2;
		System.out.println(list.get(index));
	}
}
