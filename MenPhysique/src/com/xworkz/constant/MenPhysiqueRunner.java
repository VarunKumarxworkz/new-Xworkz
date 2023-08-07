package com.xworkz.constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MenPhysiqueRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
			
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym", "root","Xworkzodc@123");
			
			String query = "insert into supplement values(1,'Varun',
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
