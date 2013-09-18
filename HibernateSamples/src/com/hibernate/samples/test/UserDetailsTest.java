package com.hibernate.samples.test;

import static com.hibernate.samples.util.HibernateUtil.getSessionFactory;

import org.hibernate.Session;

import com.hibernate.samples.basic.UserDetails;

public class UserDetailsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = (Session) getSessionFactory().openSession();
		session.beginTransaction();
		
		UserDetails user = null;
		for(int i=0; i < 10;i++){
			user = new UserDetails("Keerthi Kumar", "Bangalore");
			session.save(user);
		}
		
		
		session.getTransaction().commit();
		session.close();
		
	}

}
