package com.xworkz.vadachennai.dao;

public interface VadaChennaiDao {
	
	public Integer Save(String Hero,int BoxOfficeCollection,int Invest,String Director) throws ValueNotFoundException; 
	public Integer Read();
	public Integer Update();
	public boolean delete();
	
	
	

}
