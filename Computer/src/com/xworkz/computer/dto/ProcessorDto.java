package com.xworkz.computer.dto;

public class ProcessorDto {

	String brand;
	int generation;
	int model;
	public ProcessorDto(String brand, int generation, int model) {
		super();
		this.brand = brand;
		this.generation = generation;
		this.model = model;
	}
	public String toString() {
		return "ProcessorDto [brand=" + brand + ", generation=" + generation + ", model=" + model + "]";
	}
	
	
	
	
	
}
