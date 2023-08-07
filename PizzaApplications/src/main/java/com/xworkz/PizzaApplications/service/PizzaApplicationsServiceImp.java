package com.xworkz.PizzaApplications.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.el.util.Validation;

import com.xworkz.PizzaApplications.PizzaApplicationsServlet;
import com.xworkz.PizzaApplications.dto.PizzaApplicationsDto;
import com.xworkz.PizzaApplications.repository.PizzaApplicationsImp;
import com.xworkz.PizzaApplications.repository.PizzaApplicationsRepo;

public class PizzaApplicationsServiceImp implements PizzaApplicationsService {
	
	PizzaApplicationsServlet serv = new PizzaApplicationsServlet();
	PizzaApplicationsRepo repo = new PizzaApplicationsImp();
	
	public boolean validateAndSave(PizzaApplicationsDto dto) throws Exception{
		
      System.out.println("validated");
      
      ValidatorFactory factory =  javax.validation.Validation.buildDefaultValidatorFactory();
      Validator validate = factory.getValidator();
      Set<ConstraintViolation<PizzaApplicationsDto>> set =  validate.validate(dto);
      if(set.isEmpty()) {
    	  System.out.println("validation");
    	boolean save =  repo.save(dto);
    	System.out.println(save);
      }
      else {
    	  System.out.println(set);
      }
	return false;
		

		
		
	}


	
	

}
