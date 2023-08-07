package com.xworkz.facebook.dto;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class FaceBookDto {
	private int id;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=50)
	private String firstName;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=50)
	private String lastName;
	private Date dateOfBirth;
	@Email
	private String email;
	private long phoneNumber;
	@NotBlank
	@NotEmpty
	private String gender;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=50)
	private String password;
	private int age; 
	public FaceBookDto(int id,String firstName, String lastName, Date dateOfBirth, String email, long phoneNumber,
			String gender, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "FaceBookDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender
				+ ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	

}
