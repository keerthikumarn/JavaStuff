package com.hibernate.samples.test;

import static com.hibernate.samples.util.HibernateUtil.getSessionFactory;

import org.hibernate.Session;

import com.hibernate.samples.basic.Department;
import com.hibernate.samples.basic.Employee;

public class OneToManyTest {

	public static void main(String[] args) {
		Session session = (Session) getSessionFactory().openSession();
		session.beginTransaction();
		
		Department dept = new Department();
		dept.setDepartmentName("Marketing");
		
		Employee emp1 = new Employee("Keerthi", "Kumar", "9886967754");
		Employee emp2 = new Employee("Raghav", "Nayak", "9880566966");
		
		emp1.setDepartment(dept);
		emp2.setDepartment(dept);

		session.save(dept);
		session.save(emp1);
		session.save(emp2);
		
		session.getTransaction().commit();
		session.close();
		
		Session session1 = (Session) getSessionFactory().openSession();
		session1.beginTransaction();
		Employee e1 = (Employee) session1.load(Employee.class, 1);
		System.out.println(e1.getFirstName()+" "+e1.getLastName());
		session1.close();
		
		Session session2 = (Session) getSessionFactory().openSession();
		session2.beginTransaction();
		Employee e2 = (Employee) session2.load(Employee.class, 1);
		System.out.println(e2.getFirstName()+" "+e2.getLastName());
		session2.close();

	}

}
