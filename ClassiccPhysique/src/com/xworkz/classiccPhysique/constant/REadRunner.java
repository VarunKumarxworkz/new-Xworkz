package com.xworkz.classiccPhysique.constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class REadRunner {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/gympro","root","Xworkzodc@123");
			String query2 = "select* from gym_schedule";
			Statement stat = con.createStatement();
			ResultSet res = stat.executeQuery(query2);
			System.out.println(res);
		
			if(res!=null) {
				while(res.next()) {
					
					System.out.println(res.getInt(1) + " " + res.getString(2) + "" + res.getInt(3) + "" + res.getInt(4) + "" + res.getString(5) + "" + 
					res.getInt(6) + "" + res.getLong(7) + "" + res.getString(8) + "" + res.getInt(9) + "" + res.getString(10));
					
					
					
				}
			}
			con.close();
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
