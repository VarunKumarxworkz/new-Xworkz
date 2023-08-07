package com.xworkz.business.repository;

import com.xworkz.business.dto.BusinessDto;

public interface BusinessRepository {
	
	public boolean save(BusinessDto dto);
	
	public boolean UpdateById(BusinessDto dto,int Id);
	
	public boolean UpdateByName(String Name);
    
	public boolean UpdateBy3(String Name,String LanguageKnown,String Skill);

}
