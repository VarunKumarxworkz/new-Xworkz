package com.xworkz.schoolsystem.service;

import com.xworkz.linkdIn.dto.LinkdInDto;

public interface LinkdInService {
	public boolean save(LinkdInDto dto);
	public boolean UpdateByemailAddress(String email,int id);
	public boolean ReadByid(int id);
	public boolean ReadByidandemailAddress(int id ,String email);
	public boolean DeleteByemailAddress(String email);
	
	
}
