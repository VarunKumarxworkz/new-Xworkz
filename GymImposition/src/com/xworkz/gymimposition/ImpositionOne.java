package com.xworkz.gymimposition;

public class ImpositionOne {
	
	public ImpositionOne() {
		
		this(5);
		System.out.println("1st Constructor");
	}
public ImpositionOne(int NoOfTimes) {
		 this(2,true);
		 System.out.println("2st Constructor");
	}
public ImpositionOne(String topic,int NoOfTimes) {
	System.out.println("3st Constructor");
}
public ImpositionOne(int duration,boolean Isneeded) {
	this(true,"doubletime");
	System.out.println("4st Constructor");
}
public ImpositionOne(boolean IsAnyPunishment,String Punishment) {
	this("constructor Chaining",5);
	System.out.println("5st Constructor");
}

	public static void main(String[] args) {
		ImpositionOne gym =	 new ImpositionOne();
	} 

}
