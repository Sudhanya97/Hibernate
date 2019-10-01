package com.zensar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {

	public static void main(String[] args) {
		
	
	Configuration c = new Configuration().configure();
	//singleton and heavy weight session factory
	SessionFactory f = c.buildSessionFactory();
	Session s = f.openSession();  	//	represents database connection
	Transaction t = s.beginTransaction();

	Movie m = s.get(Movie.class, 1);
	
	System.out.println(m.getTitle());
	System.out.println(m.getReleaseDate());
	List<Song> listOfSongs = m.getListOfSongs();
	
	for(Song currSong : listOfSongs)
	{
		System.out.println(currSong);
	}
	
	if(m!=null)
	{
		s.delete(m);
	}
	else
	{
		System.out.println("Sorry! Movie Not Found");
	}
	t.commit();
	s.close();
	System.exit(0);
}
	
}
