package com.tostringbuilder.demo;

import java.util.Date;

public class ToStringBuilderTest {

	public static void main(String[] args) {
		UGStudent ug = getUGStudent();
		System.out.println(ug);
	}
	
	public static UGStudent getUGStudent(){
		UGStudent ugStudent = new UGStudent();
		ugStudent.setId(3014);
		ugStudent.setFirstName("Keerthi");
		ugStudent.setLastName("Kumar");
		ugStudent.setLastLoggedIn(new Date());
		ugStudent.setPlace("Bangalore");
		return ugStudent;
	}

}
