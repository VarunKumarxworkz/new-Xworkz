package com.xworkz.airpods.repo;

import java.util.List;

import com.xworkz.airpods.dto.AirpodsDto;

public interface AirPodsRepo {

	public boolean store(AirpodsDto dto);

	public boolean updateColorByName(String color, String name);

	public boolean deleteByPrice(int price);

	public List<AirpodsDto>readAll();
	
	
}
