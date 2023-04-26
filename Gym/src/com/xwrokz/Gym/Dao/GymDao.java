package com.xwrokz.Gym.Dao;

public class GymDao {

	String[] Brand = new String[10]; 
	
	
	public String[] SaveString(String Str) {
	
		if(Str!=null && Str.length()>3) {
		
		
	      for(int i=0;i<Brand.length;i++) {
    	 
	
	if (Brand[i]==null) {
	
	
	Brand[i] = Str;
	System.out.println(Brand[i]);
	return Brand;
	
	
	
	}
	}
		}
		System.out.println("not Printing");
	return Brand;
}
	
	public void read() {
		for(int j=0;j<Brand.length;j++) {
			System.out.println(Brand[j]);
		}
	}
	
	
	
	
	
}



