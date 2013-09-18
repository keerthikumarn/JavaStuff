package com.hibernate.samples.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.samples.basic.UserDetails;

public class QueryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Query query =  session.createQuery("from UserDetails where userId > 5");
		List list = (ArrayList) query.list();
		UserDetails user = null;
		
		for(int i=0; i<list.size();i++){
			user = (UserDetails) list.get(i);
			System.out.println(user.getUserId());
		}
		
		session.getTransaction().commit();
		session.close();
		
		

	}

}
