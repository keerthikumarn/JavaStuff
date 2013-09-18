package com.hibernate.samples.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.samples.basic.Person;
import com.hibernate.samples.basic.Vehicle;

public class OneToMany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Person person = new Person();
		person.setName("Keerthi Kumar");
		
		
		Vehicle car = new Vehicle();
		car.setVehicleName("Swift Car");
		
		Vehicle bike = new Vehicle();
		bike.setVehicleName("Pulsar Bike");
		
		person.getVehicle().add(car);
		person.getVehicle().add(bike);
		car.setPerson(person);
		bike.setPerson(person);
		
		session.save(person);
		session.save(car);
		session.save(bike);
		session.getTransaction().commit();
		session.close();

	}

}
