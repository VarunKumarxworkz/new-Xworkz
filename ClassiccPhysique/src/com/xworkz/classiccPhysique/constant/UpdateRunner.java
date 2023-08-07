package com.xworkz.classiccPhysique.constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRunner {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e) {
		e.printStackTrace();
	}
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gympro", "root", "Xworkzodc@123");
		
		String query3 = "update gym_schedule set trainerName = 'gokul' where Id=1";
		
		Statement state = con.createStatement();
		
		boolean resu = state.execute(query3);
		System.out.println("updated" + resu);
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
	
}
