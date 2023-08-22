package com.xworkz.Icecreamapplication.dto;

public class IceCreamDto {
	private int id;
	private String name;
	private String flavour;
	private String type;
	
	public IceCreamDto() {
		System.out.println("default constructor");
	}

	public IceCreamDto(int id, String name, String flavour, String type) {
		super();
		this.id = id;
		this.name = name;
		this.flavour = flavour;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "IceCreamDto [id=" + id + ", name=" + name + ", flavour=" + flavour + ", type=" + type + "]";
	}

	

}
