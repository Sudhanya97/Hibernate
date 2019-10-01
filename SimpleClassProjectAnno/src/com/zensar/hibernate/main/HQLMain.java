package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class HQLMain {

	public static void main(String[] args) {
		
		//HQL - Hibernate Query Language(Object Oriented Query LAnguage)
		Configuration c = new Configuration().configure();
		//singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();  	//	represents database connection
		Transaction t = s.beginTransaction();
		
		//Query q = s.createQuery("from Product");//JPA( Java PErsistence API) Query
		//Query q = s.createQuery("from Product p where p.price>5000 and p.price<20000");
		//Query q = s.createQuery("from Product p where p.price between 15000 and 40000");
		//Query q = s.createQuery("from Product p where p.brand like 'R%'");
		//Query q = s.createQuery("from Product p where p.name='Laptop'");
		//Query q = s.createQuery("select p.name,p.price from Product p ");
		
//		List<Product> products = q.getResultList();
//		for(Product currProd : products)
//		{
//			System.out.println(currProd);
//		}
//		Query q = s.createQuery("select p.name,p.price from Product p ");
//		List<Object[]> objects = q.getResultList();					//List of array of objects
//		for(Object[] object:objects)
//		{
//			for(Object currProduct : object)
//			{
//				System.out.println(currProduct+"\t");
//			}
//		}
		
		/*
		 * Query q = s.createQuery("select p.name,p.price,p.brand from Product p ");
		 * List<Object[]> objects = q.getResultList(); //List of array of objects
		 * for(Object[] object:objects) { for(Object currProduct : object) {
		 * System.out.print(currProduct+"\t"); } System.out.println(); }
		 */
		Query q = s.createQuery("select max(p.price) from Product p");
		Float maxPrice = (Float) q.getSingleResult();
		System.out.println(maxPrice);
		
		Query q1 = s.createQuery("select min(p.price) from Product p");
		Float minPrice = (Float) q1.getSingleResult();
		System.out.println(minPrice);
		
		Query q2 = s.createQuery("select sum(p.price) from Product p");
		Double sumPrice = (Double) q2.getSingleResult();
		System.out.println(sumPrice);
		
		Query q3 = s.createQuery("select avg(p.price) from Product p");
		Double avgPrice = (Double) q3.getSingleResult();
		System.out.println(avgPrice);

		Query q4 = s.createQuery("select count(p.price) from Product p");
		Long countPrice = (Long) q4.getSingleResult();
		System.out.println(countPrice);

		Criteria cr = s.createCriteria(Product.class);
		List<Product> products = cr.list();
		for(Product currProduct : products)
		{
			System.out.println(currProduct);
		}
		t.commit();
		s.close();
	}

}
