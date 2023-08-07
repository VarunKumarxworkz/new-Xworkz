package com.xworkz.mobiles.dao;

import java.util.ArrayList;

public class MobilesImp implements MobilesRepo {

	ArrayList<String> list = new ArrayList<String>();

	
	public Boolean Save(String name, String brand, String Shop) {

		list.add(name);
		list.add(brand);
		list.add(Shop);
		System.out.println("Saved");
		
		return false;
	}
	public Boolean Read() {
		for(String str:list) {
			System.out.println(str);
		
		}
		return true;
	}
	public Boolean Update() {
		list.set(0,"Vio");
		Read();
		return true;
	}
	public Boolean Delete() {
		list.remove(0);
		Read();
		return true;
		
	}
}
