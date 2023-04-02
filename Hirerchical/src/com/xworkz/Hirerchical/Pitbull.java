package com.xworkz.Hirerchical;

public class Pitbull extends Dogs {

	String petName;
	byte Age;
	int Height;
	int Size;
	
public void danger() {
	System.out.println("MostDangerous");
}
	
public static void main(String[] args) {
	
	Huskey Wolf = new Huskey("Blue",38);
	
	System.out.println(Wolf.colourOfEye);
	
	Wolf.BlackWhite();
	
	GermanShepered German = new GermanShepered(true,'A');
	
	German.goodDog();
	
	TibetianMustife gaint = new TibetianMustife();
	
	 gaint.Bheaviour();
	
	
}
	
	
	
	
}
