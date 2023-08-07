package com.xworkz.schoolsystem.service;

import java.sql.Connection;
import java.sql.DriverManager;

import com.xworkz.linkdIn.dto.LinkdInDto;
import com.xworkz.schoolsystem.repository.LinkdInRepo;
import com.xworkz.schoolsystem.repository.RepoImp;

public class ServicImp {

	LinkdInRepo rep = new RepoImp();
	
	public boolean save(LinkdInDto dto) {
	 rep.save(dto);
	 System.out.println("saved SUcessfully");
	return true;
	}
	public boolean UpdateByemail(String email,int id) {
		rep.UpdateByemailAddress(email, id);
		System.out.println("updated");
		return true;
	}
	public boolean ReadByid(int id) {
		rep.ReadByid(id);
		System.out.println("readed");
		return true;
	}
	
	public boolean ReadByidandemailAddress(int id ,String email) {
		rep.ReadByidandemailAddress(id, email);
		System.out.println("readed");
		return true;
}
	public boolean DeleteByemailAddress(String email) {
		rep.DeleteByemailAddress(email);
		System.out.println("deletedquery");
		return true;
	}
}
