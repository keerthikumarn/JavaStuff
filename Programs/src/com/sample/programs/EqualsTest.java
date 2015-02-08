package com.sample.programs;

public class EqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.setId(100);
		stu2.setId(100);
		
		System.out.println(stu1.equals(stu2));
	}

}

