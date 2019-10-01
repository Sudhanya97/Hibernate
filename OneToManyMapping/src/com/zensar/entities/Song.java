package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Sudhanya Mukhopadhyay
 * @creation_date 27 Sep 2019 16:46
 * @modification_date 27 Sep 2019 16:46
 * @version 1.0
 * @Copyright Zensar Technologies. All Rights Reserved.
 * @description This is a class Song for demonstrating One-To-Many relationship
 *
 */
@Entity
public class Song {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int songId;
		private String songname;
		@ManyToOne
		@JoinColumn(name = "movie_ID")
		private Movie movie;
		
		
		public Song(String songname) {
			
			this.songname = songname;
		}

		public Movie getMovie() {
			return movie;
		}

		public void setMovie(Movie movie) {
			this.movie = movie;
		}


		public String getSongname() {
			return songname;
		}

		public void setSongname(String songname) {
			this.songname = songname;
		}

		public Song() {
			// TODO Auto-generated constructor stub
		}

		public Song(int songId) {
			
			this.songId = songId;
		}

		public int getSongId() {
			return songId;
		}

		public void setSongId(int songId) {
			this.songId = songId;
		}

		@Override
		public String toString() {
			return "Song [songId=" + songId + ", songname=" + songname + "]";
		}

	
		
}
