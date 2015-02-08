package com.sorting.demo;

import java.io.Serializable;

public class Student implements Comparable{
	
	private int regNo;
	private String name;
	private String course;
	
	public Student(){
		
	}
	
	public Student(int regNo, String name, String course){
		this.regNo = regNo;
		this.name = name;
		this.course = course;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public int compareTo(Object obj) {
		Student student = (Student) obj;
		return (this.regNo < student.regNo)? -1 : (this.regNo > student.regNo)? 1 : 0;
	}
	
	
}
