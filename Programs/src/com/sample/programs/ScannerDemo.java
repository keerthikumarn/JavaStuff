package com.sample.programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = null;
		try{
			scanner = new Scanner(new BufferedReader(new FileReader("D:/logs.txt")));
			while(scanner.hasNext()){
				System.out.println(scanner.next());
			}
		}finally{
			if(scanner!=null){
				scanner.close();
			}
		}
		
	}

}
