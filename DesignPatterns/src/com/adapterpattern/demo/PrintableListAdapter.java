package com.adapterpattern.demo;

import java.util.ArrayList;

public class PrintableListAdapter implements PrintableList {

	@Override
	public void printList(ArrayList<String> list) {
		String listString = "";
		
		for(String s : list){
			listString += s + "\t";
		}
		
		PrintString printString = new PrintString();
		printString.print(listString);
	}

}
