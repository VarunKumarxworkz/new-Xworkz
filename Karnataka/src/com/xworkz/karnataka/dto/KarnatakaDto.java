package com.xworkz.karnataka.dto;

public class KarnatakaDto {
	
    private int id;
	private String capital;
	private String language;
	private String stateAnimal;
	private String food;
	private int radius;
	
	public  KarnatakaDto () {
		System.out.println("default Constructor");
	}

	public KarnatakaDto(int id, String capital, String language, String stateAnimal, String food, int radius) {
		super();
		this.id = id;
		this.capital = capital;
		this.language = language;
		this.stateAnimal = stateAnimal;
		this.food = food;
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getStateAnimal() {
		return stateAnimal;
	}

	public void setStateAnimal(String stateAnimal) {
		this.stateAnimal = stateAnimal;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "KarnatakaDto [id=" + id + ", capital=" + capital + ", language=" + language + ", stateAnimal="
				+ stateAnimal + ", food=" + food + ", radius=" + radius + "]";
	}
	
	
}
