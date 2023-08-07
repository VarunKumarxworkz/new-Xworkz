package com.xworkz.buss.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.buss.dto.BussDto;

public interface BussService {
	public boolean save(BussDto dto);
	public BussDto findBylocation(String location);
	  public boolean  updatenameBylocation(String name,String location);
	  public BussDto findByname(String name);
	  public boolean updatenoOfseatsByname(String name,int noOfseats);
	  public boolean deleteByname(String name);
}
