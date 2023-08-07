package com.xworkz.PollyMorphismPractice;

public class PollyMorphismPractice {
	
	int price;
	String name;
	String address;
	int budget;
	
	public PollyMorphismPractice (int price,String name,String address,int budget) {
		this.price = price;
		this.name = name;
		this.address = address;
		this.budget = budget;
	}
	
	public  void read(int time) {
		System.out.println("reading");
	}
	public  void read(String name) {
		System.out.println("Branded");
	}
	public String toString(){
		return "PollyMorphismPractice["+ ",price = " + price + ",name = " + name + ",address = " + address + ",budget = " + budget + "]";
	}
	
}
