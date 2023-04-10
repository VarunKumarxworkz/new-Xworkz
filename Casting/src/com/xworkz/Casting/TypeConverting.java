package com.xworkz.Casting;

public class TypeConverting {

	
	public static void main(String[] args) {
		
		
		//Implicit
		
	byte noOfClothes;
	
	short dressShops = 100;
	
	noOfClothes = (byte) dressShops;
	
	
	System.out.println(noOfClothes);			
		
		
		
	byte noOfShoes = 60;
	short BrandedShoe;
		
	BrandedShoe = noOfShoes;	
		
		
	System.out.println(BrandedShoe);
	
	
	short noOfBuildings;
	int noOfAppartment = 20000;
	
	noOfBuildings = (short)noOfAppartment;
	
	System.out.println(noOfBuildings);
	
	
	short noOfGuest = 30000;
	int noOfStay;
	
	noOfStay = noOfGuest;
	
	System.out.println(noOfStay);
	
	
	int GoodsinContainer;
	long LoadsInShip = 8000000;
	
	GoodsinContainer = (int)LoadsInShip;
	
	System.out.println(GoodsinContainer);	
	
	int BagsOfLoad = 7000000;
	long WeightOfLoad;
	
	WeightOfLoad = BagsOfLoad;
	
	System.out.println(WeightOfLoad);
	
	long PhoneNumber;
	double ContactNumber = 8877398364.879d;
	
	PhoneNumber = (long)ContactNumber;
	
	System.out.println(PhoneNumber);
	
	
	long carPrice = 4000000;
	double Rating;
	
	Rating = carPrice;
	
	System.out.println(Rating);	
	
	
	
	byte CarVarity;
	int CarsShowroom =90;
	
	CarVarity = (byte)CarsShowroom;
	
	System.out.println(CarVarity);	
	
	byte BikeVarity = 87;
	int BikeShowroom;
	
	BikeShowroom = BikeVarity;
	
	System.out.println(BikeShowroom);
	
	double temp;
	float Bmi = 25.98f;
	
	temp = Bmi;
	
	System.out.println(temp);
	
	double ratio = 245.098d;
	float Field;
	
	Field = (float)ratio;
	
	System.out.println(Field);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
