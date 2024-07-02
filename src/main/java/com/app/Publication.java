package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class Publication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Author a = new Author();
		
		//a.setA_id(1); it is auto generated 
		a.setA_name("Swati");
		
		session.persist(a);
		
		tx.commit();
		
		System.out.println("success");
		
		session.close();
	}

}
