package com.xworkz.javacodetest;

public class JavaTest2 {
	
	public static boolean checkSquareRoot(int number) {
		int square = (int) Math.sqrt(number);
		if(square>0) {
			System.out.println(square);
		}
		if(square*square==number) {
			System.out.println("perfect number");
			int bio = square*square;
			System.out.println(bio);
			return true;
		}
		System.out.println("not perfect");
		return false;
		
	}
	
	public static void main(String[] args) {
		boolean rot = checkSquareRoot(4);
		System.out.println(rot);
	}
	
	
	

}
