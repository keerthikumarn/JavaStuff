package com.hibernate.samples.test;

import static com.hibernate.samples.util.HibernateUtil.getSessionFactory;

import org.hibernate.Session;

import com.hibernate.samples.basic.Capital;
import com.hibernate.samples.basic.Country;

public class OneToOneTest {

	public static void main(String[] args) {
		Session session = (Session) getSessionFactory().openSession();
		session.beginTransaction();
		
		Country india = new Country("India",50000000);  
		Capital delhi = new Capital("Delhi",4000000);  
		india.setCapital(delhi);  
		Country france = new Country("France",20000000);  
		Capital paris = new Capital("Paris",1000000);  
		france.setCapital(paris);  
		
		session.save(india);
		session.save(delhi);
		session.save(france);
		session.save(paris);
		
		session.getTransaction().commit();

	}

}
