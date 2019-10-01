package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {
	
	public static void main(String[] args) {
		
		Configuration c = new Configuration().configure();
		//singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();  	//	represents database connection
		Transaction t = s.beginTransaction();
		
		Employee e = new Employee();
		e.setName("Sudhanya Mukhopadhyay");
		e.setJoinDate(LocalDate.of(2019, 8, 19));
		e.setSalary(74000.00);
		
		s.save(e);
		
		WageEmp wageEmp = new WageEmp();
		wageEmp.setName("Sudhanya");
		wageEmp.setJoinDate(LocalDate.of(2019, 8, 26));
		wageEmp.setHours(52);
		wageEmp.setRate(12.25f);
		wageEmp.setSalary(7400.00);
		
		s.save(wageEmp);
		
		t.commit();
		s.close();
	}

}
