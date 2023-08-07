package com.xworkz.Kadamban.dto;

public class KadambanDto {

	private String name;
	private String hero;
	private String heroin;
	private String director;
	private String villan;
	private int boxOfficeCollection;
	private int budject;
	private String name1;
	public KadambanDto(String name, String hero, String heroin, String director, String villan, int boxOfficeCollection,
			int budject,String name1) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroin = heroin;
		this.director = director;
		this.villan = villan;
		this.boxOfficeCollection = boxOfficeCollection;
		this.budject = budject;
		this.name1 = name1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroin() {
		return heroin;
	}
	public void setHeroin(String heroin) {
		this.heroin = heroin;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getVillan() {
		return villan;
	}
	public void setVillan(String villan) {
		this.villan = villan;
	}
	public int getBoxOfficeCollection() {
		return boxOfficeCollection;
	}
	public void setBoxOfficeCollection(int boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}
	public int getBudject() {
		return budject;
	}
	public void setBudject(int budject) {
		this.budject = budject;
	}
	@Override
	public String toString() {
		return "KadambanDto [name=" + name + ", hero=" + hero + ", heroin=" + heroin + ", director=" + director
				+ ", villan=" + villan + ", boxOfficeCollection=" + boxOfficeCollection + ", budject=" + budject + ",name1=" + name1 + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
