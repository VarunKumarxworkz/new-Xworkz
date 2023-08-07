package com.xworkz.backpack.dto;

import com.xworkz.backpack.constant.Type;

public class BackpackDto {
	
	private String brand;
	private int price;
	private Type type;
	private DesignDto design;
	private String shop;
	public BackpackDto(String brand, int price, Type type, DesignDto design, String shop) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.design = design;
		this.shop = shop;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public DesignDto getDesign() {
		return design;
	}
	public void setDesign(DesignDto design) {
		this.design = design;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "BackpackDto [brand=" + brand + ", price=" + price + ", type=" + type + ", design=" + design + ", shop="
				+ shop + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
