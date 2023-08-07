package com.xworkz.FitnessApplication.repository;

import java.sql.ResultSet;

import com.xworkz.FitnessApplication.dto.FitnessApplicationDto;

public interface FitnessApplicationRepo {
	
	public boolean save(FitnessApplicationDto dto);
	public ResultSet findByage ( FitnessApplicationDto dto ,String Age);
	

}
