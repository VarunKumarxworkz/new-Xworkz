package com.xworkz.hotel.dto;

public class FoodListDto {

	private String dish;
	private int price;
	private String desert;
	private String starts;
	public FoodListDto(String dish, int price, String desert, String starts) {
		super();
		this.dish = dish;
		this.price = price;
		this.desert = desert;
		this.starts = starts;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesert() {
		return desert;
	}
	public void setDesert(String desert) {
		this.desert = desert;
	}
	public String getStarts() {
		return starts;
	}
	public void setStarts(String starts) {
		this.starts = starts;
	}
	@Override
	public String toString() {
		return "FoodListDto [dish=" + dish + ", price=" + price + ", desert=" + desert + ", starts=" + starts + "]";
	}
	
	
	
	
	
	
	
	
	
}
