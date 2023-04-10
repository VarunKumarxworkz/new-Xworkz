package com.xworkz.Solution;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		
		int[] CarPrice = {200000,300000,400000,500000,600000};
		int[] BikePrice = {100000,200000,600000,800000,1000000};
		
		System.out.println("intersecting of two Array");
		
		for(int i=0;i<CarPrice.length;i++)
		for(int j=0;j<BikePrice.length;j++)
		
		if (CarPrice[i]==BikePrice[j]) {
			System.out.println(CarPrice[i]);
		}
		
		
	}
	
}
