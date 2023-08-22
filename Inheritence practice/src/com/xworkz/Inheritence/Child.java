package com.xworkz.Inheritence;
public class Child extends Parent{

	public Child(int shoeSize, int price, String brand) {
		super(shoeSize, price, brand);
		
	}

	public static void read(){
		System.out.println("readed");
		
		
	}

	public static void main(String[] args) {
//		Parent par = new Parent(40,3000,"nike");
//		System.out.println(par.brand);
//		
//		Child.run();
		byte[] shoeSize = {5,6,7,8,9,10};
		int[] shoePrice = {2000,3000,4000,5000};
		String[] brand = {"nike","puma","Addidas"};
		long[] shoeMaxPrice = {15000,17000,18000};	
		System.out.println(shoeSize[3]);
		System.out.println(shoePrice[3]);
		
	}
	
	
	
	
	
	
	
	
}
