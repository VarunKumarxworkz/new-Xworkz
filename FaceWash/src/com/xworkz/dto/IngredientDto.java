package com.xworkz.dto;

public class IngredientDto {

	private String name;
	private int quantity;
	private int price;
	
	public IngredientDto(String name, int quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String toString() {
		return "IngredientDto [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
