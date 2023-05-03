package com.xworkz.bike.dto;

public class BikeDto {

	private String brandName;
	private int price;
	private String colour;
	private int Milage;
	public BikeDto(String brandName, int price, String colour, int milage) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.colour = colour;
		Milage = milage;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getMilage() {
		return Milage;
	}
	public void setMilage(int milage) {
		Milage = milage;
	}
	@Override
	public String toString() {
		return "BikeDto [brandName=" + brandName + ", price=" + price + ", colour=" + colour + ", Milage=" + Milage
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
