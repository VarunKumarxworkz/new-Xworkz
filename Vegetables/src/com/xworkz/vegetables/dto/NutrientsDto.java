package com.xworkz.vegetables.dto;

public class NutrientsDto {

	private int protien;
	private int carbs;
	private int fat;
	private int calories;
	
	public NutrientsDto(int protien, int carbs, int fat, int calories) {
		super();
		this.protien = protien;
		this.carbs = carbs;
		this.fat = fat;
		this.calories = calories;
	}
	public int getProtien() {
		return protien;
	}
	public void setProtien(int protien) {
		this.protien = protien;
	}
	public int getCarbs() {
		return carbs;
	}
	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
	
	
	public String toString() {
		return "NutrientsDto [protien=" + protien + ", carbs=" + carbs + ", fat=" + fat + ", calories=" + calories
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
