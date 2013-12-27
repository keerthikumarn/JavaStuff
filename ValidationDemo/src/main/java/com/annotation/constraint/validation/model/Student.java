package com.annotation.constraint.validation.model;

import com.annotation.constraint.validation.ValidateStringCase;
import com.annotation.constraint.validation.enumeration.StringCase;

public class Student{

	@ValidateStringCase(value = StringCase.UPPER, message = "String should be in UPPER case")
	private String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
