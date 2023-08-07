package com.xworkz.business;

import com.xworkz.business.dto.BusinessDto;
import com.xworkz.business.service.ServiceImp;
import com.xworkz.business.service.ServiceInt;

public class BusinessRunner {
	
	public static void main(String[] args) {
	
		BusinessDto dto = new BusinessDto();
		ServiceInt ser =  new ServiceImp();
		
		dto.setId(4);
		dto.setName("kiran");
		dto.setAge(22);
		dto.setQualification("M.E");
		dto.setEmail("kiran@gmail.com");
		dto.setLanguageKnown("kannada");
		dto.setExperience(3);
		dto.setSkill("java");
		dto.setSalary(20000);
		dto.setBranches("BTM");
		
		//ser.save(dto);
		
		//dto.setLanguageKnown("kannada");
		//ser.UpdateById(dto,1);
		
		//dto.setName("arun");
		ser. UpdateByName("vijay");
		
	}

}
