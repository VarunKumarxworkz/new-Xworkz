package com.xworkz.business.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.business.dto.BusinessDto;

public class BusinessRepImp implements BusinessRepository {
	
	public boolean save(BusinessDto dto) {
		System.out.println("saved & validated");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/business","root","Xworkzodc@123");
				
				//String query = "insert into business_table values(1,'varun',23,'B.E','varunvio@gmail.com','kannada',3,'jAVA',20000,'BTM')";
				
				String query = "insert into business_table values(?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement sta = con.prepareStatement(query);
				sta.setInt(1, dto.getId());
				sta.setString(2,dto.getName() );
				sta.setInt(3, dto.getAge());
				sta.setString(4, dto.getQualification());
				sta.setString(5,dto.getEmail());
				sta.setString(6,dto.getLanguageKnown());
				sta.setInt(7,dto.getExperience());
				sta.setString(8,dto.getSkill());
				sta.setInt(9,dto.getSalary() );
				sta.setString(10, dto.getBranches());
				 int result = sta.executeUpdate();
				 System.out.println("saved" + result);
				 
				 con.close();
				
			}catch(Exception e){
				e.printStackTrace();
			
		}
		return false;
		
	}

	public boolean UpdateById(BusinessDto dto,int Id) {
		System.out.println("Updating");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/business","root","Xworkzodc@123");
			String query2 = "update business_table set languageKnown =? where Id = ?";
			PreparedStatement stat = con.prepareStatement(query2);
			stat.setString(1,dto.getLanguageKnown());
			stat.setInt(2,dto.getId());
			int res = stat.executeUpdate();
			System.out.println("updated" + res);
			
			if(res>0) {
				System.out.println("executed by updating languageknown");
			}
			else {
				System.out.println("not executed by updating languageKnown");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
	}

public boolean  UpdateByName(String Name) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/business", "root","Xworkzodc@123");
		String query3 = "update business_table set name = ? where Id =3";
		PreparedStatement statt = con.prepareStatement(query3);
		
		statt.setString(1, Name);
		
		
		int resu = statt.executeUpdate();
		System.out.println("Name updated sucessfully" + resu);
		
		if(resu>0) {
			System.out.println("sucessFully updated");
		}
		else {
			System.out.println("not updated");
		}
	}catch(Exception e) {
			e.printStackTrace();
	
		}
	return false;	
	
	
}
public boolean UpdateBy3(String Name,String LanguageKnown,String Skill) {
	
	try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
}catch(Exception e) {
	e.printStackTrace();
}
  
try {
	DriverManager.getConnection("jdbc , LanguageKnown, Skill)
}































}
