package com.xworkz.vegtable.dto;

import com.xworkz.vegtable.constant.Type;

public class VegtableDto {

	private String name;
	private int cost;
	private Type type;
	private NutrientDto nutrient;
	private String mode;
	
	public  VegtableDto(String name,int cost,Type type,NutrientDto nutrient,String mode) {
		this.name = name;
		this.cost = cost;
		this.type = type;
		this. nutrient =  nutrient;
		this.mode = mode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public NutrientDto getNutrient() {
		return nutrient;
	}

	public void setNutrient(NutrientDto nutrient) {
		this.nutrient = nutrient;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String toString() {
		return "VegtableDto [name=" + name + ", cost=" + cost + ", type=" + type + ", nutrient=" + nutrient + ", mode="
				+ mode + "]";
	}
	
	
	
	
}
