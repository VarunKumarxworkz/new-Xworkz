package com.xworkz.FitnessApplication.service;
import java.sql.ResultSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.FitnessApplication.Servlet;
import com.xworkz.FitnessApplication.dto.FitnessApplicationDto;
import com.xworkz.FitnessApplication.repository.FitnessApplicationRepo;
import com.xworkz.FitnessApplication.repository.FitnessApplicationRepoImp;

public class FitnessApplicationSerImp implements FitnessApplicationServ {
	Servlet ser = new Servlet();
	FitnessApplicationRepo repo = new FitnessApplicationRepoImp();
	
	public boolean save(FitnessApplicationDto dto)throws Exception {
		Servlet ser = new Servlet();
		FitnessApplicationRepo repo = new FitnessApplicationRepoImp();
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		 Set<ConstraintViolation<FitnessApplicationDto>> set = validate.validate(dto);
		 
		 if(set.isEmpty()) {
			 System.out.println("validated");
			 boolean value = repo.save(dto);
			 
		 }
		 else {
			 System.out.println(set);
		 }
		return true;
	}

	@Override
	public ResultSet findByage(FitnessApplicationDto dto, String Age) {
		Servlet ser = new Servlet();
		FitnessApplicationRepo repo = new FitnessApplicationRepoImp();
	      //repo.findByage(dto, Age);
	      ResultSet ref =  repo.findByage(dto, Age);
	      System.out.println(ref);
		return ref;
	     
	}

}
