package com.xworkz.mobiles.dao;

public interface MobilesRepo {
	
	
	public Boolean  Save(String name,String brand,String Shop);
	
	public Boolean Read();
	
	public Boolean Update();
	
	public Boolean Delete();

}
