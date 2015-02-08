package com.hibernate.samples.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.samples.basic.UserDetails;

public class HibernateCacheTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.openSession();
		session1.beginTransaction();
		
		UserDetails user1 = (UserDetails)session1.get(UserDetails.class, 1);
		System.out.println("First time data loading from db : "+user1.getName());
		session1.getTransaction().commit();
		session1.close();
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		
		UserDetails user2 = (UserDetails)session2.get(UserDetails.class, 1);
		System.out.println("Loading data from cache : "+user2.getName());
		session2.getTransaction().commit();
		session2.close();
		
		
		

	}

}
