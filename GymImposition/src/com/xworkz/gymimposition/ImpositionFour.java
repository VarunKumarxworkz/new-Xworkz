package com.xworkz.gymimposition;

public class ImpositionFour {
public ImpositionFour() {
		
		this(5);
		System.out.println("1st Constructor");
	}
public ImpositionFour(int NoOfTimes) {
		 this(2,true);
		 System.out.println("2st Constructor");
	}
public ImpositionFour(String topic,int NoOfTimes) {
	System.out.println("3st Constructor");
}
public ImpositionFour(int duration,boolean Isneeded) {
	this(true,"doubletime");
	System.out.println("4st Constructor");
}
public ImpositionFour(boolean IsAnyPunishment,String Punishment) {
	this("constructor Chaining",5);
	System.out.println("5st Constructor");
}

	public static void main(String[] args) {
		ImpositionFour gym4 =	 new ImpositionFour();

	}
}
