package com.xworkz.serum;

public class SerumRunner {

	public static void main(String[] args) {
		
		SerumRepo serum = (b,p,q)->{
		System.out.println("Face glowed");
		
		System.out.println(b);
		System.out.println(q);
		return p;
		
		};
		
		int values = serum.FaceSerum("WOW", 350, 100);
		System.out.println(values);
		
		

	}
		
		
		
		
	
	
	
}
