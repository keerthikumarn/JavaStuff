package com.sample.programs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		hashTable.put("Name", "Keerthi Kumar N");
		hashTable.put("Course", "MCA");
		hashTable.put("Address", "Bangalore");
		
		Enumeration<String> data =  hashTable.keys();
		while(data.hasMoreElements()){
			String str = (String) data.nextElement();
			System.out.println(str + " : "+hashTable.get(str));
		}
		
	}

}

