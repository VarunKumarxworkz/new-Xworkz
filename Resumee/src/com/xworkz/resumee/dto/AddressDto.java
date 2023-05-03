package com.xworkz.resumee.dto;

public class AddressDto {
	
	int doorNo;
	String StreetName;
	String area;
	String Taluk;
	String District;
	public AddressDto(int doorNo, String streetName, String area, String taluk, String district) {
		super();
		this.doorNo = doorNo;
		StreetName = streetName;
		this.area = area;
		Taluk = taluk;
		District = district;
	}

	
	
	

}
