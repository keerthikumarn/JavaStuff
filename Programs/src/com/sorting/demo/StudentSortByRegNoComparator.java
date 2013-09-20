package com.sorting.demo;

import java.util.Comparator;

public class StudentSortByRegNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		return (stu1.getRegNo() < stu2.getRegNo()) ? -1 :(stu1.getRegNo() > stu2.getRegNo()) ? 1 : 0;
	}

}
