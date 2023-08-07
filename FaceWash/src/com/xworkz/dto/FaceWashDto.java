package com.xworkz.dto;

import com.xworkz.constant.Type;

public class FaceWashDto {
	
	private String name;
	private int price;
	private Type type;
	private IngredientDto ingredient;
	private String platform;
	
	
	public FaceWashDto(String name,int price,Type type,IngredientDto ingredient,String platform) {
		
		this.name = name;
		this.price = price;
		this.type = type;
		this.ingredient = ingredient;
		this.platform = platform;
	
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public IngredientDto getIngredient() {
		return ingredient;
	}

	public void setIngredient(IngredientDto ingredient) {
		this.ingredient = ingredient;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String toString() {
		return "Name =" + name + ",Price =" + price + ",Type =" + type +",Ingredient =" + ingredient + ",PlatFrom =" + platform ;
				
				
				
				
				
				
	}
	
	
	
	

}
