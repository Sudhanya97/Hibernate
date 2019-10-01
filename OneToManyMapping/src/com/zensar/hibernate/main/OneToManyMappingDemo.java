package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyMappingDemo {

		public static void main(String[] args) {
			Configuration c = new Configuration().configure();
			//singleton and heavy weight session factory
			SessionFactory f = c.buildSessionFactory();
			Session s = f.openSession();  	//	represents database connection
			Transaction t = s.beginTransaction();
		
			Song s1 = new Song();
			s1.setSongname("dddgd");
			
			Song s2 = new Song();
			s2.setSongname("abcde");


			Song s3= new Song();
			s3.setSongname("efrgj");

			
			
			Movie m1 = new Movie();
			m1.setTitle("DDLJ");
			m1.setReleaseDate(LocalDate.of(2019, 5, 15));
			
			s1.setMovie(m1);
			s2.setMovie(m1);
			s3.setMovie(m1);
			
			List<Song> listOfSongs = new ArrayList<Song>();
			listOfSongs.add(s1);
			listOfSongs.add(s2);
			listOfSongs.add(s3);
			
			m1.setListOfSongs(listOfSongs);
			
			s.save(m1);
			s.save(s1);
			s.save(s2);
			s.save(s3);
			t.commit();
			s.close();
		}
}
