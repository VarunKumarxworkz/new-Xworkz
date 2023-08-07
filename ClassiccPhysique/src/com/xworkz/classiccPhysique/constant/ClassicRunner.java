package com.xworkz.classiccPhysique.constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ClassicRunner {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e){
           e.printStackTrace();			
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gympro","root","Xworkzodc@123");
			String query = "insert into gym_schedule values(2,'kiran',4000,6,'Varun',4000,9867864565,'Crea',3000,'Good')";
			Statement sta = con.createStatement();
			int Classic = sta.executeUpdate(query);
			System.out.println("inserted" + Classic);
			
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	

}
