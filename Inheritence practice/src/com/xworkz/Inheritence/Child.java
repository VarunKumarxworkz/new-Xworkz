package com.xworkz.Inheritence;
public class Child extends Parent{

	public Child(int shoeSize, int price, String brand) {
		super(shoeSize, price, brand);
		
	}

	public static void read(){
		System.out.println("readed");
		
		
	}

	public static void main(String[] args) {
		Parent par = new Parent(40,3000,"nike");
		System.out.println(par.brand);
		
		Child.run();
		
	}
	
	
	
	
	
	
	
	
}
