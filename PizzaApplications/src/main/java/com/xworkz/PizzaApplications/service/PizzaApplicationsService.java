package com.xworkz.PizzaApplications.service;

import com.xworkz.PizzaApplications.dto.PizzaApplicationsDto;

public interface PizzaApplicationsService {

	public boolean validateAndSave(PizzaApplicationsDto dto) throws Exception;
	
}
