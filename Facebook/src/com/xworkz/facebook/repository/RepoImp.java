package com.xworkz.facebook.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.facebook.dto.FaceBookDto;

public class RepoImp implements FaceBookRepo {

	public boolean save(FaceBookDto dto) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Date date = new Date(2001, 11, 4);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		String query = "insert into facebook_table values(?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, dto.getId());
		statement.setString(2, dto.getFirstName());
		statement.setString(3, dto.getLastName());
		statement.setDate(4, dto.getDateOfBirth());
		statement.setString(5, dto.getEmail());
		statement.setLong(6, dto.getPhoneNumber());
		statement.setString(7, dto.getGender());
		statement.setString(8, dto.getPassword());

		int result = statement.executeUpdate();

		if (result > 0) {
			System.out.println("saved");
		} else {

		}
		return false;

	}

	public boolean  update(String firstName, String lastName, Date dateOfBirth, String email, long phoneNumber,
			String gender, String password) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		String query2 = "update facebook_table set firstName =?,lastName =?,dateOFBirth =?,email =?,phoneNumber =?,gender = ?,password =? where id=3";

		PreparedStatement statement = con.prepareStatement(query2);

		statement.setString(1, firstName);
		statement.setString(2, lastName);
		statement.setDate(3, dateOfBirth);
		statement.setString(4, email);
		statement.setLong(5, phoneNumber);
		statement.setString(6, gender);
		statement.setString(7, password);

		int result = statement.executeUpdate();

		if (result > 0) {
			System.out.println("update");
		} else {

		}
		return false;
	}

	public boolean read() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		String query3 = "select * from facebook_table";
		PreparedStatement statement = con.prepareStatement(query3);
		ResultSet result = statement.executeQuery();

		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getString(3) + ""
						+ result.getDate(4) + "" + result.getString(5) + "" + result.getLong(6) + ""
						+ result.getString(7) + "" + result.getString(8));
			}
		} else {

		}
		return false;
	}

	public boolean delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		String query4 = "delete from facebook_table where id=?";
		PreparedStatement statement = con.prepareStatement(query4);
		statement.setInt(1, id);

		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("deleted");
		} else {

		}
		return false;

	}

	public boolean deleteByfirstname(String name) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		String query5 = "delete from facebook_table where firstname=?";
		PreparedStatement statement = con.prepareStatement(query5);
		statement.setString(1, name);
		int result = statement.executeUpdate();

		if (result > 0) {
			System.out.println("deleted");
		} else {

		}
		return false;

	}

	public boolean updateByemail(String email) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		String query6 = "update facebook_table set email =? where id=1";
		PreparedStatement statement = con.prepareStatement(query6);
		statement.setString(1, email);
		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("dleted");
		} else {

		}
		return false;
	}

	public boolean readByemail(String email) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		String query7 = "select * from facebook_table where email =?";
		PreparedStatement statement = con.prepareStatement(query7);
		statement.setString(1, email);

		ResultSet result = statement.executeQuery();
		if (result != null) {

			while (result.next()) {
				System.out.println(result.getInt(1) + "" + result.getString(2) + "" + result.getString(3) + ""
						+ result.getDate(4) + "" + result.getString(5) + "" + result.getLong(6) + ""
						+ result.getString(7) + "" + result.getString(8));
			}
			return true;
		} else {

		}
		return false;

	}

}
