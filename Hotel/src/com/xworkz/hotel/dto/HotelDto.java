package com.xworkz.hotel.dto;

import com.xworkz.hotel.constant.Type;

public class HotelDto {

	private String name;
	private String location;
	private Type type;
	private FoodListDto list;
	private int price;
	
	public HotelDto() {
		System.out.println("defaultConstructor");
	}
	public HotelDto(String name, String location, Type type, FoodListDto list, int price) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.list = list;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public FoodListDto getList() {
		return list;
	}
	public void setList(FoodListDto list) {
		this.list = list;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "HotelDto [name=" + name + ", location=" + location + ", type=" + type + ", list=" + list + ", price="
				+ price + "]";
	}
	

	
	
	
	
	
	
	
}
