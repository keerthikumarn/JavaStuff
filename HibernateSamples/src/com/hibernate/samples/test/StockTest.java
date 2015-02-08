package com.hibernate.samples.test;

import static com.hibernate.samples.util.HibernateUtil.getSessionFactory;

import org.hibernate.Session;

import com.hibernate.samples.basic.Stock;

public class StockTest {
	public static void main(String[] ar){
		Session session = (Session) getSessionFactory().openSession();
		session.beginTransaction();
		
		Stock stock = new Stock();
		stock.setStockCode("3014");
		stock.setStockName("Test Stock");
		
		session.save(stock);
		session.getTransaction().commit();
	}
}
