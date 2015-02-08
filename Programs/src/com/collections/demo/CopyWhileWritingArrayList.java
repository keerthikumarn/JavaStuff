package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author kenarayan
 * 
 * 1. CopyOnWriteArrayList is thread safe.
 * 2. The operations like add, set in CopyOnWriteArrayList are made by taking fresh copy.
 * 3. While iterating CopyOnWriteArrayList, we can not add are remove or modify.
 * 4. CopyOnWriteArrayList is used in collection framework and this is available from jdk 1.5. 
 *
 */

public class CopyWhileWritingArrayList {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("Keerthi");
		list.add("Kumar");
		list.add("Raghav");
		list.add("Nayak");
		
		list.addIfAbsent("Nayak");
		list.remove("Keerthi");
		
		Iterator<String> itr = list.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		List<String> newList = new ArrayList<String>();
		
		newList.add("Keerthi");
		newList.add("Kumar");
		newList.add("Raghav");
		newList.add("Nayak");
		
		newList.remove("Nayak");
		
		Iterator<String> itr1 = newList.listIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}

}
