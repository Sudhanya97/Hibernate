package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappungMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration().configure();
		//singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();  	//	represents database connection
		Transaction t = s.beginTransaction();
		
		Country country = new Country();
		country.setName("India");
		country.setPopulation(130000000);
		country.setLanguage("Hindi");
		
		Flag flag = new Flag();
		flag.setFlagName("Tiranga");
		flag.setDescription("Tricolor flag");
		
		flag.setCountry(country);
		country.setFlag(flag);
		
		s.save(flag);
		s.save(country);
		t.commit();
		s.close();
	}

}
