package com.xworkz.leo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="leo")
@Entity
@NamedQuery(name="findByName",query = "select dto from LeoDto dto where dto.hero=:hn")
public class LeoDto {
	
	@Id
	private int id;
	private String hero;
	private String villan;
	private String musicDirector;
	private int budget;
	private String director;
	
	
	public LeoDto() {
		System.out.println("Default constructor");
	}


	public LeoDto(int id, String hero, String villan, String musicDirector, int budget, String director) {
		super();
		this.id = id;
		this.hero = hero;
		this.villan = villan;
		this.musicDirector = musicDirector;
		this.budget = budget;
		this.director = director;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public String getVillan() {
		return villan;
	}


	public void setVillan(String villan) {
		this.villan = villan;
	}


	public String getMusicDirector() {
		return musicDirector;
	}


	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}


	public int getBudget() {
		return budget;
	}


	public void setBudget(int budget) {
		this.budget = budget;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	@Override
	public String toString() {
		return "LeoDto [id=" + id + ", hero=" + hero + ", villan=" + villan + ", musicDirector=" + musicDirector
				+ ", budget=" + budget + ", director=" + director + "]";
	}

	
}
