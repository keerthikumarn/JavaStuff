package com.sample.programs;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargestNum {

	public static void main(String[] ar){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(3);
		list.add(6);
		list.add(87);
		list.add(66);
		
		int secondHighest = findSecondHighest(list);
		System.out.println(secondHighest);
	}
	
	private static int findSecondHighest(List<Integer> list){
		int highest = list.get(0);
		int secondHighest = list.get(0);
		
		for(int i=0; i < list.size();i++){
			if(list.get(i) > highest){
				secondHighest = highest;
				highest = list.get(i);
			}else if(list.get(i) > secondHighest){
				secondHighest = list.get(i);
			}else if(secondHighest == highest){
				secondHighest = list.get(i);
			}
		}
		return secondHighest;
	}


}
