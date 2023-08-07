package com.xworkz.schoolsystem.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import com.xworkz.linkdIn.dto.LinkdInDto;

public class RepoImp implements LinkdInRepo {
	
	public boolean save(LinkdInDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Date date = new Date(04112001);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkdin","root","Xworkzodc@123");
			 String query = "insert into linkdin_table values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement statement = con.prepareStatement(query);
			 statement.setInt(1,dto.getId());
			 statement.setString(2, dto.getName());
			 statement.setString(3,dto.getFatherName());
			 statement.setDate(4,dto.getDateOfBirth());
			 statement.setString(5,dto.getQualification());
			 statement.setString(6, dto.getEmailAddress());
			 statement.setLong(7,dto.getPhoneNumber());
			 statement.setString(8,dto.getLanguageKnown());
			 statement.setInt(9,dto.getConnection());
			 statement.setString(10,dto.getSkill());
			 statement.setString(11,dto.getHobbies());
			 statement.setString(12,dto.getAreaOfIntrest());
			 statement.setString(13,dto.getUniversity());
			 statement.setFloat(14,dto.getCgpa());
			 statement.setString(15,dto.getStrength());
			 
			 int result = statement.executeUpdate(); 
			 
			 System.out.println("updated" + result);
			 
			 if(result>0) {
				 System.out.println("query updtaed");
					 
				 }
			 else {
				 
			 }
			 
			 			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;	
		
	}

	public boolean UpdateByemailAddress(String email,int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkdin","root","Xworkzodc@123");
			String query2 = "update linkdin_table set emailAddress =? where id = ?";
			PreparedStatement statement = con.prepareStatement(query2);
			
			statement.setString(1,email);
			statement.setInt(2, id);
			
			int result = statement.executeUpdate();
			if(result>0) {
				System.out.println("updated");
			}
			else {
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean ReadByid(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkdin","root","Xworkzodc@123");
			
			String query3 = "select * from linkdin_table where id = ?";
					
			PreparedStatement statement = con.prepareStatement(query3);
			
			statement.setInt(1,id);
			
		ResultSet result = statement.executeQuery();
		if(result!=null) {
			while(result.next()) {
				System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getString(3) + "" + result.getDate(4) + "" +
			result.getString(5) + "" + result.getString(6) + "" + result.getLong(7) + "" + result.getString(8) + "" + result.getString(9) + "" +
			result.getString(10));
			}
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
		
	}
	public boolean ReadByidandemailAddress(int id ,String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkdin","root","Xworkzodc@123");
			String query4 = "select * from linkdin_table where id = ? & emailAddress = ?";
			PreparedStatement statement = con.prepareStatement(query4);
			statement.setInt(1, id);
			statement.setString(2, email);
			ResultSet result = statement.executeQuery();
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getString(3) + "" + result.getDate(4) + "" +
							result.getString(5) + "" + result.getString(6) + "" + result.getLong(7) + "" + result.getString(8) + "" + result.getString(9) + "" +
							result.getString(10));
				}
			}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return false;
	
}
	public boolean DeleteByemailAddress(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkdin","root","Xworkzodc@123");
			
			String query5 = "delete from linkdin_table where emailAddress = ?";
			PreparedStatement statement = con.prepareStatement(query5);
			statement.setString(1,email);
			int result = statement.executeUpdate();
			if(result>0) {
				System.out.println("deleted");
			}
			else{
				
			}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
		return false;

	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
}