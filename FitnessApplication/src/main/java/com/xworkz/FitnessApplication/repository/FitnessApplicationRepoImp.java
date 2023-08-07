package com.xworkz.FitnessApplication.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.FitnessApplication.dto.FitnessApplicationDto;

public class FitnessApplicationRepoImp implements FitnessApplicationRepo {

	
	public boolean save(FitnessApplicationDto dto) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fitness","root","Xworkzodc@123");
			String query = "insert into fitness_table values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,dto.getName());
			statement.setString(2,dto.getAge());
			statement.setString(3,dto.getHeight());
			statement.setString(4,dto.getWeight());
			statement.setString(5,dto.getBMI());
			statement.setString(6,dto.getPackages());
			statement.setString(7,dto.getTiming());
			statement.setString(8,dto.getExperience());
			statement.setString(9,dto.getEmail());
			statement.setString(10,dto.getContact());
			statement.setString(11,dto.getAddress());
			
			int result = statement.executeUpdate();
			System.out.println("update" + result);
			if(result>0) {
				System.out.println("saved");
			}
			else {
				System.out.println(result);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
		
	}

	@Override
	public ResultSet findByage(FitnessApplicationDto dto, String Age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fitness","root","Xworkzodc@123");
			String query2 = "select * from fitness_table where age=?";
			PreparedStatement statement = con.prepareStatement(query2);
			statement.setString(1,dto.getAge());
			ResultSet result = statement.executeQuery();
			System.out.println("update" + result);
			if(result!=null) {
				while(result.next()){
					System.out.println("Finding");
					System.out.println(result.getString(1) + " " +result.getString(2) + " " +result.getString(3) + " " +result.getString(4) + " " +result.getString(5) + " " +result.getString(6) + " " +result.getString(7) );
				}
			}
			else {
				System.out.println(result);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
