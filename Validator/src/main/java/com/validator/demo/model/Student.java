package com.validator.demo.model;

import com.validator.demo.annotation.StudentValidation;

public class Student {
	
	@StudentValidation(message = "You may only enter [Keerthi Kumar N]", caseSensitive=true)
	private String name;
	
	public Student(){
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
