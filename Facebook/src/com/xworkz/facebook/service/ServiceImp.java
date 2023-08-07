package com.xworkz.facebook.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.facebook.dto.FaceBookDto;
import com.xworkz.facebook.repository.FaceBookRepo;
import com.xworkz.facebook.repository.RepoImp;

public class ServiceImp {
	FaceBookRepo rep = new RepoImp();

	public boolean save(FaceBookDto dto) throws Exception {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validation = factory.getValidator();
		 Set<ConstraintViolation<FaceBookDto>> set = validation.validate(dto);
		 if(set.isEmpty()) {
			 rep.save(dto);
				System.out.println("Dto is saved"); 
				return true;
		 }
		 else {
			 System.out.println(set);
			
		 }
		
		return false;
	}
	
	public boolean update(String firstName, String lastName, Date dateOfBirth, String email, long phoneNumber,
			String gender, String password)throws Exception{
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		//ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		//Validator validation = factory.getValidator();
				Validator validation = factory.getValidator();
				 Set<ConstraintViolation<String>> set = validation.validate(lastName);
		// Set<ConstraintViolation<String>> set = validation.validate(lastName);
		 if(set.isEmpty()) {
			 rep.update( firstName, lastName, dateOfBirth, email, phoneNumber, gender, password);
				System.out.println("Updated");
		 }else {
			 System.out.println(set);
		 }
		
		return false;
		
	}
	public boolean read()throws Exception {
		rep.read();
		System.out.println("readed");
		return false;
	}
	public boolean delete(int id)throws Exception{
		rep.delete(id);
		System.out.println("Query deleted");
		return false;
	}
	public boolean deleteByfirstname(String name)throws Exception{
		rep.deleteByfirstname(name);
		System.out.println("name Deleted");
		return false;
	}
	public boolean updateByemail(String email)throws Exception{
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validation = factory.getValidator();
		 Set<ConstraintViolation<String>> set = validation.validate(email);
		 if(set.isEmpty()) {
			 rep.updateByemail(email);
				System.out.println("email updated");
		 }else {
			 System.out.println(set);
		 }
		
		return false;
	}
	public boolean readByemail(String email)throws Exception{
	boolean read =	rep.readByemail(email);
	System.out.println(read);
		System.out.println("readed by email");
		return true;
	}
}
