package com.xworkz.backpack.dto;

public class DesignDto {
	
	private String name;
	private int cost;
	private int inch;
	private String colour;
	public DesignDto(String name, int cost, int inch, String colour) {
		super();
		this.name = name;
		this.cost = cost;
		this.inch = inch;
		this.colour = colour;
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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String toString() {
		return "DesignDto [Name=" + name + "cost=" + cost + "Inch=" + inch + "colour=" + colour + "]";
				
	}
	
	
	
}
