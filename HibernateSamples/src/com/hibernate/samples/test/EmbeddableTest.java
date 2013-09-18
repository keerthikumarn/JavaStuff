package com.hibernate.samples.test;

import static com.hibernate.samples.util.HibernateUtil.getSessionFactory;

import org.hibernate.Session;

import com.hibernate.samples.basic.Animal;
import com.hibernate.samples.basic.Tiger;

public class EmbeddableTest {

	public static void main(String[] args) {
		Session session = (Session) getSessionFactory().openSession();
		session.beginTransaction();
		
		Animal animal = new Animal("Tiger A", "India");
		Tiger tiger = new Tiger(1, animal);
		
		session.save(tiger);
		session.getTransaction().commit();
		session.close();
	}

}
