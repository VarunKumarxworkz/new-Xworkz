package com.xworkz.schoolsystem.repository;

import com.xworkz.linkdIn.dto.LinkdInDto;

public interface LinkdInRepo {

	public boolean save(LinkdInDto dto);
	public boolean UpdateByemailAddress(String email,int id);
	public boolean ReadByid(int id);
	public boolean ReadByidandemailAddress(int id ,String email);
	public boolean DeleteByemailAddress(String email);
	
}
