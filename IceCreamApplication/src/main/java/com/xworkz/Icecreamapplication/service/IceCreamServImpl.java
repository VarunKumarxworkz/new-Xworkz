package com.xworkz.Icecreamapplication.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.Icecreamapplication.IceCreamServlet;
import com.xworkz.Icecreamapplication.dto.IceCreamDto;
import com.xworkz.Icecreamapplication.repo.IceCreamRepo;
import com.xworkz.Icecreamapplication.repo.IceCreamRepoImpl;

public class IceCreamServImpl implements IceCreamServ{
	IceCreamRepo repo = new IceCreamRepoImpl();
//	IceCreamServlet servlet = new IceCreamServlet();
	
	@Override
	public boolean save(IceCreamDto dto)throws Exception {
		 ValidatorFactory factory =  javax.validation.Validation.buildDefaultValidatorFactory();
	      Validator validate = factory.getValidator();
	      Set<ConstraintViolation<IceCreamDto>> set =  validate.validate(dto);
	      if(set.isEmpty()) {
	    	  System.out.println("validation");
	    	boolean save =  repo.save(dto);
	    	System.out.println(save);
	    	System.out.println("vadada");
	      }
	      else {
	    	  System.out.println(set);
	      }
		return false;
	}

}
