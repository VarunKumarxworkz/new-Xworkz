package com.xworkz.food.dto;

public class FoodDto {
	private String name;
	private int cost;
	private String type;
	
	
	public FoodDto(String name,int cost,String type) {
		
		this. name =  name;
		this.cost = cost;
		this.type = type;	
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
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
	
	
	public String toString() {
		
		return "Name ="+name+"Cost = "+cost+"Type = "+type;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
