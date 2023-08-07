package com.xworkz.kgf.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Entity
@Table(name = "kgf")


public class KGFDto {
	@Id
	private int id;
	private String hero;
	private String villan;
	private int boxOfficeCollection;
	private int budget;
	private int part;
	
	public KGFDto() {
		System.out.println("this no arg construtor");
	}
	
	public KGFDto(int id, String hero, String villan, int boxOfficeCollection, int budget, int part) {
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
		return "KGFDto [id=" + id + ", hero=" + hero + ", villan=" + villan + ", boxOfficeCollection="
				+ boxOfficeCollection + ", budget=" + budget + ", part=" + part + "]";
	}
	
	
	

}
