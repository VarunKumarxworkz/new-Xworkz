package com.xworkz.clubb.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.clubb.dto.ClubbDto;
import com.xworkz.clubb.repo.ClubbRepo;
import com.xworkz.clubb.repo.ClubbRepoImpl;

public class ClubbServiceImpl implements ClubbService {
	ClubbRepo repo = new ClubbRepoImpl();
			
	public boolean save(ClubbDto dto) {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validate = factory.getValidator();
//		 Set<ConstraintViolation<ClubbDto>> set = validate.validate(dto);
//		 
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getName().length()>3) {
					if(dto.getLocation().length()>3) {
						if(dto.getAllowed().length()>3){
							if(dto.getRules().length()>3) {
								repo.save(dto);
								return true;
							}
							System.out.println("rules is not valid");
							return false;
						}
						System.out.println("Allowed only couples ");
						return false;
					}
					System.out.println("loaction is not valid");
					return false;
				}
				System.out.println("name is not valid");
				return false;
			}
			System.out.println("id is grester");
			return false;
			}
		System.out.println("Dto is null");
		
		return false;
		
	}

	@Override
	public ClubbDto read(int id) {
	if(id>0) {
      System.out.println("reading");
      return repo.read(id);
	}
		return null;
	}

	@Override
	public ClubbDto update(ClubbDto dto) {
		if(dto!=null) {
			System.out.println("updated");
			return repo.update(dto);
		}
		return null;
	}



}
