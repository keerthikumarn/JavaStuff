package com.xml.domparser.demo;

public class Student {
	
	private String name;
	private int regNo;
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [Name = " + name + ", Register No.= " + regNo + ", Course = " + course + "]";
	}
	
}
