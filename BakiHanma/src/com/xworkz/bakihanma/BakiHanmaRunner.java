package com.xworkz.bakihanma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.bakihanma.dto.BakiHanmaDto;

public class BakiHanmaRunner {
	
	public static Credentials cred;
	public static void main(String[] args) {
	BakiHanmaDto dto = new BakiHanmaDto(2,"Baki",87,"Yujiro");
		save(dto);
	//	updateEpisodesByName(90,"okai");
	}

	public static boolean save(BakiHanmaDto dto) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	try {
		Connection con = DriverManager.getConnection( cred.URL.name, cred.USER.name, cred.Pass.name);
		String query = "insert into baki_table values(?,?,?,?)";
		PreparedStatement statement =con.prepareStatement(query);
		statement.setInt(1, dto.getId());
		statement.setString(2, dto.getName());
		statement.setInt(3, dto.getEpisodes());
		statement.setString(4, dto.getVillan());
		int result = statement.executeUpdate();
		System.out.println(result);
		if(result>0) {
			System.out.println("saved");
		}
		else {
			System.out.println("not saved");
		}
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return false;
	
}
 public static boolean updateEpisodesByName(int episodes,String name) {
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baki","root","Xworkzodc@123");
	       String query = "update baki_table set episode=?  where name=?";
	       PreparedStatement statement = con.prepareStatement(query);
	       statement.setInt(1, episodes);
	       statement.setString(2, name);
	       int result = statement.executeUpdate();
	       System.out.println(result);
	       if(result>0) {
	    	   System.out.println("updated");
	       }
	       else {
	    	   System.out.println("not updated");
	       }
 }catch(Exception e) {
	 e.printStackTrace();
 }
		return false;
}
}