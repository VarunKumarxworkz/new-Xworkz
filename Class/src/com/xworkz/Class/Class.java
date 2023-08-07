package com.xworkz.Class;

public class Class {

		int price;
	   String name;
	   Marvel mar;
public Class(int price,String name,Marvel mar) {
	this.price = price;
	this.name = name;
	this.mar = mar;
}

public static void main(String[] args) {
	Class clas = new Class(200,"varun",Marvel.DESRET);
	System.out.println(clas.mar);
	System.out.println(clas.price);
	
}

		
		}
enum Marvel{
	FOOD,JUICE,DESRET;
	
}
	

