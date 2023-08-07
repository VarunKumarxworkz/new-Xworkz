package com.xworkz.gymimposition;

public class ImpositionFive {
public ImpositionFive() {
		
		this(5);
		System.out.println("1st Constructor");
	}
public ImpositionFive(int NoOfTimes) {
		 this(2,true);
		 System.out.println("2st Constructor");
	}
public ImpositionFive(String topic,int NoOfTimes) {
	System.out.println("3st Constructor");
}
public ImpositionFive(int duration,boolean Isneeded) {
	this(true,"doubletime");
	System.out.println("4st Constructor");
}
public ImpositionFive(boolean IsAnyPunishment,String Punishment) {
	this("constructor Chaining",5);
	System.out.println("5st Constructor");
}

	public static void main(String[] args) {
		ImpositionFive gym5 =	 new ImpositionFive();

	}

}
