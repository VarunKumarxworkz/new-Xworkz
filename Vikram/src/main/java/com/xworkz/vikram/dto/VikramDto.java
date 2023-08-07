package com.xworkz.vikram.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "vikram")
@Entity
//@NamedQuery(name="readAll" ,query = "select dto from VikramDto dto")
//@NamedQuery(name = "update",query = "update dto set dto.budget=:bd where dto.id=:id")
//@NamedQuery(name = "delete",query = "delete from Vikramdto dto where dto.id=:id")
public class VikramDto {
	@Id
    private int id;
	private String hero;
	private String villan;
	private int boxOfficeCollection;
	private int budget;
	private int part;
	
	public VikramDto() {
		System.out.println("default constructor");
	}

	public VikramDto(int id, String hero, String villan, int boxOfficeCollection, int budget, int part) {
		super();
		this.id = id;
		this.hero = hero;
		this.villan = villan;
		this.boxOfficeCollection = boxOfficeCollection;
		this.budget = budget;
		this.part = part;
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

	public int getBoxOfficeCollection() {
		return boxOfficeCollection;
	}

	public void setBoxOfficeCollection(int boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getPart() {
		return part;
	}

	public void setPart(int part) {
		this.part = part;
	}

	@Override
	public String toString() {
		return "VikramDto [id=" + id + ", hero=" + hero + ", villan=" + villan + ", boxOfficeCollection="
				+ boxOfficeCollection + ", budget=" + budget + ", part=" + part + "]";
	}

	
	
	
	
}
