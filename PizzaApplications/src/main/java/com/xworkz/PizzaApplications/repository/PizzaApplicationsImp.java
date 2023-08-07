package com.xworkz.PizzaApplications.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.PizzaApplications.dto.PizzaApplicationsDto;

public class PizzaApplicationsImp implements PizzaApplicationsRepo {

	public boolean save(PizzaApplicationsDto dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza","root","Xworkzodc@123");
			String query = "insert into pizza_table values(?,?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setString(1,dto.getName());
			statement.setString(2,dto.getAddress());
			statement.setString(3,dto.getType());
			statement.setString(4,dto.getSize());
			statement.setString(5,dto.getPaymentMode());
			
			int result = statement.executeUpdate();
			System.out.println("update" + result);
			
			statement.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
		
		
		
		
		
	}
	
	
	
	

}
