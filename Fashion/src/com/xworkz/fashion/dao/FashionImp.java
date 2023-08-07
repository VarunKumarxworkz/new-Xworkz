package com.xworkz.fashion.dao;

import java.util.ArrayList;

public class FashionImp implements FashionInt{

	ArrayList list = new ArrayList();
	
	public Integer Save(String brand,int price,int netWorth) {
		list.add(brand);
		list.add(price);
		list.add(netWorth);
		System.out.println("Saved");
		return netWorth + 120000;
	}
	public Boolean Read() {
		for(Object obj:list) {
			System.out.println(obj);
		
		}
		return true;
	}
	
	public Boolean Update() {
		list.set(1,7000);
		Read();
		System.out.println("Updated");
		return true;
	}
	
	public Boolean Delete() {
		list.remove(2);
		Read();
		System.out.println("Deleted");
		return true;
	}
	
}
