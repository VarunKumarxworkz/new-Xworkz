package com.xworkz.gymimposition;

public class ImpositionThree {
public ImpositionThree() {
		
		this(5);
		System.out.println("1st Constructor");
	}
public ImpositionThree(int NoOfTimes) {
		 this(2,true);
		 System.out.println("2st Constructor");
	}
public ImpositionThree(String topic,int NoOfTimes) {
	System.out.println("3st Constructor");
}
public ImpositionThree(int duration,boolean Isneeded) {
	this(true,"doubletime");
	System.out.println("4st Constructor");
}
public ImpositionThree(boolean IsAnyPunishment,String Punishment) {
	this("constructor Chaining",5);
	System.out.println("5st Constructor");
}

	public static void main(String[] args) {
		ImpositionThree gym3 =	 new ImpositionThree();

	}

}
