package com.xworkz.ihff.dto;

public class IhffRulesDto {

	private int height;
	private int weight;
	private int waistSize;
	private int shoulderSize;
	public IhffRulesDto(int height, int weight, int waistSize, int shoulderSize) {
		super();
		this.height = height;
		this.weight = weight;
		this.waistSize = waistSize;
		this.shoulderSize = shoulderSize;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWaistSize() {
		return waistSize;
	}
	public void setWaistSize(int waistSize) {
		this.waistSize = waistSize;
	}
	public int getShoulderSize() {
		return shoulderSize;
	}
	public void setShoulderSize(int shoulderSize) {
		this.shoulderSize = shoulderSize;
	}
	@Override
	public String toString() {
		return "IhffRulesDto [height=" + height + ", weight=" + weight + ", waistSize=" + waistSize + ", shoulderSize="
				+ shoulderSize + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
