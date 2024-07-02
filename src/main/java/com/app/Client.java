package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Transaction;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Book b = new Book();
		
		b.setBookName("testing");
		b.setBookPublication("tecth-Nirali");
		b.setPrice(370.78f);
		
		//session.persist(b);
		
		Query query = session.createQuery("From Book");
		
		List<Book> books = query.list();
		
		for(Book b1:books)
		{
			System.out.println(b1.getBookName()+" "+b1.getBookPublication()+" "+b1.getPrice());
		}
		
		String hql = "UPDATE Book set price = :price WHERE bookName = :bookName";
		Query query_up = session.createQuery(hql);
		
		query_up.setParameter("price", 500f);
		query_up.setParameter("bookName", "java");
		
		int result = query_up.executeUpdate();
		
		System.out.println("rows affected : "+result);
		
		
		
		
		tx.commit();
		
		System.out.println("success");
		
		session.close();
	}

}
