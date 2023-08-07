package com.xworkz.facebook.repository;

import java.sql.Date;

import com.xworkz.facebook.dto.FaceBookDto;

public interface FaceBookRepo {

	public boolean save(FaceBookDto dto) throws Exception;
	public boolean update(String firstName, String lastName, Date dateOfBirth, String email, long phoneNumber,
			String gender, String password)throws Exception;
	
	public boolean read()throws Exception;
	public boolean delete(int id)throws Exception;
		
	public boolean deleteByfirstname(String name)throws Exception;
	
	public boolean updateByemail(String email)throws Exception;
	public boolean readByemail(String email)throws Exception;
	
}
