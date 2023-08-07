package com.xworkz.FitnessApplication.service;

import java.sql.ResultSet;

import com.xworkz.FitnessApplication.dto.FitnessApplicationDto;

public interface FitnessApplicationServ {

	public boolean save(FitnessApplicationDto dto)throws Exception;
	public ResultSet findByage ( FitnessApplicationDto dto ,String Age);
	
	
}
