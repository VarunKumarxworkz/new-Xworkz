package com.xworkz.Inheritence;

public class Parent {
	
	int shoeSize;
	int price;
	String brand;
	
	public Parent(int shoeSize,	int price,String brand) {
		this.shoeSize = shoeSize;
		this.price = price;
		this.brand = brand;
	}
	
	public static void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] Args) {
		byte[] shoeSize = {5,6,7,8,9,10};
		int[] shoePrice = {2000,3000,4000,5000};
		String[] brand = {"nike","puma","Addidas"};
		long[] shoeMaxPrice = {15000,17000,18000};
		
		
//		System.out.println(shoeSize[3]);
//		System.out.println(shoePrice[3]);
		
		for(int i=0;i<brand.length;i++) {
			System.out.println(brand[i]);
		}
	}

}
