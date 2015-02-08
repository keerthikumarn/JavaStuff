package com.io.demo;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try{
			File file = new File("D:/test.txt");
			if(file.createNewFile()){
				System.out.println("New File Created");
			}else{
				System.out.println("File Already Exists");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
