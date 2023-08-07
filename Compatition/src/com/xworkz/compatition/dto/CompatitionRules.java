package com.xworkz.compatition.dto;

public class CompatitionRules {

	private int waistSize;
	private int shoulderSize;
	private int chestSize;
	private String mode;
	public CompatitionRules(int waistSize, int shoulderSize, int chestSize, String mode) {
		super();
		this.waistSize = waistSize;
		this.shoulderSize = shoulderSize;
		this.chestSize = chestSize;
		this.mode = mode;
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
	public int getChestSize() {
		return chestSize;
	}
	public void setChestSize(int chestSize) {
		this.chestSize = chestSize;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	@Override
	public String toString() {
		return "CompatitionRules [waistSize=" + waistSize + ", shoulderSize=" + shoulderSize + ", chestSize="
				+ chestSize + ", mode=" + mode + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
