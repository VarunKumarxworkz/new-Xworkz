package com.xworkz.business.service;

import com.xworkz.business.dto.BusinessDto;
import com.xworkz.business.repository.BusinessRepImp;
import com.xworkz.business.repository.BusinessRepository;

public class ServiceImp implements ServiceInt {
	BusinessRepository rep = new BusinessRepImp();
	
	public boolean save(BusinessDto dto) {
		rep.save(dto);
		System.out.println("saved & executed");
		System.out.println("repoSaved");
		return false;
	}
	
public boolean UpdateById(BusinessDto dto,int Id) {
	rep.UpdateById(dto,Id);
	System.out.println("saved updated executed");
	return false;
}

public boolean UpdateByName(String Name) {
	 rep. UpdateByName(Name);
	 System.out.println("saVED sucessfully");
	 return true;
}
}
