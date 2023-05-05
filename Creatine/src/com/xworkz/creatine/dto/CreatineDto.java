package com.xworkz.creatine.dto;

public class CreatineDto {

	private String brand;
	private int cost;
	private String type;
	private String rating;
	
	
	public CreatineDto(String brand, int cost, String type, String rating) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.type = type;
		this.rating = rating;
	}
	
	
  public String getbrand() {
	  return brand;
  }

 public void setbrand(String brand) {
	 this.brand = brand;
 }


public int getCost() {
	return cost;
}


public void setCost(int cost) {
	this.cost = cost;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public String getRating() {
	return rating;
}


public void setRating(String rating) {
	this.rating = rating;
}
	
public String toString() {
	return "Brand =" + brand + "Cost = " + cost + "Type = " + type + "Rating = " + rating;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
