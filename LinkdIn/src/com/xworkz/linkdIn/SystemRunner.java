package com.xworkz.linkdIn;

import java.sql.Date;

import com.xworkz.linkdIn.dto.LinkdInDto;
import com.xworkz.schoolsystem.service.ServicImp;

public class SystemRunner {
	
	public static void main(String[] args) {
		
		LinkdInDto dto = new LinkdInDto();
		ServicImp service = new ServicImp();
		Date date = new Date(4-11-2001);
		dto.setId(2);
		dto.setName("varun");
		dto.setFatherName("umesh");
		dto.setDateOfBirth(date);
		dto.setQualification("B.E");
		dto.setEmailAddress("varunvio@gmail.com");
		dto.setPhoneNumber(8667246802l);
		dto.setLanguageKnown("kannada");
		dto.setConnection(2);
		dto.setSkill("java");
		dto.setHobbies("gym"); 
		dto.setAreaOfIntrest("frontEnd");
		dto.setUniversity("AnnaUniversety");
		dto.setCgpa(8.9f);
		dto.setStrength("Biceps");
		
		//service.save(dto);
		
		//service.UpdateByemail("varunkumar@gamil.com", 2);
		
		//service.ReadByid(3);
		
		//service.ReadByidandemailAddress(3,"varunvio@gamil.com");
		 
		service.DeleteByemailAddress("varunvio@gmail.com");
		
		
	}
		
		
		
		
		
		
		
	}
	
	
	
	

