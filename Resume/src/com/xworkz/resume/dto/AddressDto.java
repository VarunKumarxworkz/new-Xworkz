package com.xworkz.resume.dto;

public class AddressDto extends ResumeDto {

	public AddressDto(String name, String fatherName, int dob, long phoneNumber, String mailId, AddressDto address) {
		super(name, fatherName, dob, phoneNumber, mailId, address);
	}
	int doorNumber;
	String streetName;
	String city;
	String state;
	
}
