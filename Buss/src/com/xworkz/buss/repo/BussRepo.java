package com.xworkz.buss.repo;

import com.xworkz.buss.dto.BussDto;

public interface BussRepo {
	public boolean save(BussDto dto);
	public BussDto findBylocation(String location);
    public boolean  updatenameBylocationAnd(String name,String location);
    public BussDto findByname(String name);
    public boolean updatenoOfseatsByname(String name,int noOfseats);
    public boolean deleteByname(String name);
}
