package com.xworkz.amazon.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.amazon.dto.AmazonDto;

public class AmazonRepoImpl implements AmazonRepo {

	@Override
	public boolean save(AmazonDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdcb:mysql://localhost:3306/amazon","root","Xworkzodc@123");
			String query = "insert into amazon_table values(?,?,?,?,?,?)";
			PreparedStatement statement =  con.prepareStatement(query);
			statement.setString
		}
		return false;
	}

}
