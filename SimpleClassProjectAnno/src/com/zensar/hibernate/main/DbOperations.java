package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {
	
	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		//singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();  	//	represents database connection
		Transaction t = s.beginTransaction();
		//Insert new record
		//Product p = new Product(1003,"Redmi Note7 pro","Redmi",17999.90f);
		//s.save(p);
		
		//GET RECORD ACCORDING TO PRIMARY KEY
		
//		try {
//			Product p = s.get(Product.class, 1007);
//			//Product p = s.load(Product.class, 1008);
//			if(p.equals(null)) {
//				System.out.println("The data does not exist");
//			}
//			else {
//			System.out.println(p);
//			}
//			
//			}catch(NullPointerException exc) {
//				System.out.println("The object does not exist");
//			}
		
//		try {
//			Product p = s.get(Product.class, 1001);
//			//Product p = s.load(Product.class, 1008);
//			if(p.equals(null)) {
//				throw new NullPointerException();
//			}
//			else {
//				p.setPrice((float) (p.getPrice()*1.5));
//				s.update(p);
//				System.out.println("Successfuly updated");
//				System.out.println("Current Price : "+p.getPrice());
//			}
//			
//			}catch(NullPointerException exc) {
//				System.out.println("The object does not exist");
//			}
//			
		
		//DELETE RECORD
		try {
			Product p = s.get(Product.class, 1001);
			//Product p = s.load(Product.class, 1008);
			if(p.equals(null)) {
				throw new NullPointerException();
			}
			else {
			
				s.delete(p);
			}
			
			}catch(NullPointerException exc) {
				System.out.println("The object does not exist");
			}
			
		t.commit();
		s.close();
		
		
		
	}

}
