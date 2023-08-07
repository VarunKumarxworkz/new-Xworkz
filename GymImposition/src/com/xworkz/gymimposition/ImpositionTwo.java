package com.xworkz.gymimposition;

public class ImpositionTwo {
public ImpositionTwo() {
		
		this(5);
		System.out.println("1st Constructor");
	}
public ImpositionTwo(int NoOfTimes) {
		 this(2,true);
		 System.out.println("2st Constructor");
	}
public ImpositionTwo(String topic,int NoOfTimes) {
	System.out.println("3st Constructor");
}
public ImpositionTwo(int duration,boolean Isneeded) {
	this(true,"doubletime");
	System.out.println("4st Constructor");
}
public ImpositionTwo(boolean IsAnyPunishment,String Punishment) {
	this("constructor Chaining",5);
	System.out.println("5st Constructor");
}

	public static void main(String[] args) {
		ImpositionTwo gym2 =	 new ImpositionTwo();

	}

}
