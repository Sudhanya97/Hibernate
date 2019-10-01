package com.zensar.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

/**
 * @author Dipankar Chakraborty
 * @version 2.0
 * @creation_date 21st sep 2019 5.35PM
 * @modification_date 28 Sep sep 2019 11:17AM
 * @copyright Zensar Technologies. All rights reserved.
 * @description:It is Data Access Object Interface implementor class. It is used
 *                 in Persistance layer of application.
 */
public class UserDaoImpl implements UserDao {
	
	private Session session;
	
	public UserDaoImpl() {
		
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		session = sf.openSession();
	}
	
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.save(t);
		t.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
		Transaction t = session.beginTransaction();
		session.update(t);
		t.commit();

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.delete(t);
		t.commit();

	}

	@Override
	public User getByUserName(String username) {
		// TODO Auto-generated method stub
		return session.get(User.class, username);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query q = session.createQuery("FROM USER");
		return q.getResultList();
	}

	
}
