package com.zensar.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.jpa.event.spi.jpa.ExtendedBeanManager.LifecycleListener;

/**
 * @author Sudhanya Mukhopadhyay
 * @creation_date 27 Sep 2019 16:55
 * @modification_date 27 Sep 2019 16:55
 * @version 1.0
 * @Copyright Zensar Technologies. All Rights Reserved.
 * @description This is a class Movie for demonstrating One-To-Many relationship
 *
 */
@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	private String title;
	private LocalDate releaseDate;
	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
	private List<Song> listOfSongs;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<Song> getListOfSongs() {
		return listOfSongs;
	}
	public void setListOfSongs(List<Song> listOfSongs) {
		this.listOfSongs = listOfSongs;
	}
	
	
}
