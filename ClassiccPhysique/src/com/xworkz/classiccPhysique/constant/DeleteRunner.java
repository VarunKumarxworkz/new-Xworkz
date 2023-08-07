package com.xworkz.classiccPhysique.constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRunner {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gympro", "root", "Xworkzodc@123");
			String query4 = "delete from gym_schedule where Id =2";
			Statement statem = con.createStatement();
			 boolean ress = statem.execute(query4);
			 System.out.println("deleted" + ress);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
