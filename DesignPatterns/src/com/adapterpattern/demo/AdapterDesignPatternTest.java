package com.adapterpattern.demo;

import java.util.ArrayList;

public class AdapterDesignPatternTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		PrintableList pl = new PrintableListAdapter();
		pl.printList(list);
	}

}
