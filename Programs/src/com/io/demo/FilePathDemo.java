package com.io.demo;

import java.io.File;
import java.io.IOException;

public class FilePathDemo {

	public static void main(String[] args) {
		
	try{
		String fileName = "D:/test.txt";
		String finalFile = "";
		
		String workingDir = System.getProperty("user.dir");
		String your_os = System.getProperty("os.name").toLowerCase();
	   	
		if(your_os.indexOf("win") >= 0){
	   		finalFile = workingDir + "\\" + fileName;
	   	  }else if(your_os.indexOf( "nix") >=0 || your_os.indexOf( "nux") >=0){
	   		finalFile = workingDir + "/" + fileName;
	   	  }else{
	   		finalFile = workingDir + "{others}" + fileName;
	   	  }
	
	   	System.out.println("Final filepath : " + finalFile);
	   	File file = new File(finalFile);
	
		if (file.createNewFile()){
			System.out.println("Done");
		}else{
			System.out.println("File already exists!");
		}
	}catch(IOException e){
		e.printStackTrace();
	}
	}
}
