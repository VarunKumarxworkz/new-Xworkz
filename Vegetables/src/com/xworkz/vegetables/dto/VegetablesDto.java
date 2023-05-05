package com.xworkz.vegetables.dto;

import com.xworkz.vegetables.constant.VegetablesType;

public class VegetablesDto {

	private String name;;
	private int price;
	private NutrientsDto nutrient;
	private VegetablesType type;
	private String colour;
	
	
	public VegetablesDto(String name, int price, NutrientsDto nutrient, VegetablesType type, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.nutrient = nutrient;
		this.type = type;
		this.colour = colour;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public NutrientsDto getNutrient() {
		return nutrient;
	}


	public void setNutrient(NutrientsDto nutrient) {
		this.nutrient = nutrient;
	}


	public VegetablesType getType() {
		return type;
	}


	public void setType(VegetablesType type) {
		this.type = type;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String toString() {
		return "VegetablesDto [name=" + name + ", price=" + price + ", nutrient=" + nutrient + ", type=" + type
				+ ", colour=" + colour + "]";
	}
	
	
	
	
	
	
	
}