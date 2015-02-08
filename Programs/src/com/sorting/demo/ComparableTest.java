package com.sorting.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		Student stu4 = new Student(4, "Nagesh", "BE");
		Student stu2 = new Student(2, "Kumar", "MSc");
		Student stu5 = new Student(5, "Shiva", "BCom");
		Student stu3 = new Student(3, "Gautam", "BCA");
		Student stu1 = new Student(1, "Keerthi", "MCA");
		
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(stu2);
		stuList.add(stu1);
		stuList.add(stu5);
		stuList.add(stu4);
		stuList.add(stu3);
		
		 System.out.println("Before Sort  : ");
		 for(int i=0; i < stuList.size(); i++){
			 Student stu = (Student)stuList.get(i);
			 System.out.println("Reg No : "+stu.getRegNo()+" Name : "+stu.getName()+" Course : "+stu.getCourse());
		 }
		 
		 Collections.sort(stuList);
		 System.out.println("After Sort  : ");
		 for(int i=0; i < stuList.size(); i++){
			 Student stu = (Student)stuList.get(i);
			 System.out.println("Reg No : "+stu.getRegNo()+" Name : "+stu.getName()+" Course : "+stu.getCourse());
		 }
	}

}
