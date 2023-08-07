package com.xworkz.collections.dao;

public interface CollectionDao {
	
	
	public Integer Save(String name,int value,int size,String brand)throws notValidException;
	public Boolean read();
	public Boolean update();
	public Boolean delete();

}
