package com.xworkz.movies.dto;

public class MoviesDto {

	private String movieName;
	private String directorName;
	private int budject;
	private String hero;
	private int boxOfficeCollection;
	
	
	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getDirectorName() {
		return directorName;
	}


	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}


	public int getBudject() {
		return budject;
	}


	public void setBudject(int budject) {
		this.budject = budject;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public int getBoxOfficeCollection() {
		return boxOfficeCollection;
	}


	public void setBoxOfficeCollection(int boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}


	public MoviesDto(String movieName, String directorName, int budject, String hero, int boxOfficeCollection) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
		this.budject = budject;
		this.hero = hero;
		this.boxOfficeCollection = boxOfficeCollection;
	}


	


	public String toString() {
		return "MoviesDto [movieName=" + movieName + ", directorName=" + directorName + ", budject=" + budject
				+ ", hero=" + hero + ", boxOfficeCollection=" + boxOfficeCollection + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
