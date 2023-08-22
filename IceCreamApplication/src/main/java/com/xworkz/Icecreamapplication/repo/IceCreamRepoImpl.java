package com.xworkz.Icecreamapplication.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Result;
import com.xworkz.Icecreamapplication.dto.IceCreamDto;

public class IceCreamRepoImpl implements IceCreamRepo  {

	@Override
	public boolean save(IceCreamDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/icecream","root","Xworkzodc@123");
			String query = "insert into arun_table values(?,?,?,?) ";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1,dto.getId());
			statement.setString(2,dto.getName());
			statement.setString(3,dto.getFlavour());
			statement.setString(4,dto.getType());
			int  result = statement.executeUpdate();
		
			System.out.println(result);
		    statement.close();
		}
			
		catch(Exception e) {
			e.printStackTrace();
	}
		return true;
	}
}
