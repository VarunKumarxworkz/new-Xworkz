package com.xworkz.resume.dto;

public class ResumeDto {

	private String name;
	private String fatherName;
	private int dob;
	private long phoneNumber;
	private String mailId;
	private AddressDto address;
	
	
	
	public ResumeDto(String name, String fatherName, int dob, long phoneNumber, String mailId, AddressDto address) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.mailId = mailId;
		this.address = address;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFatherName() {
		return fatherName;
	}



	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}



	public int getDob() {
		return dob;
	}



	public void setDob(int dob) {
		this.dob = dob;
	}



	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getMailId() {
		return mailId;
	}



	public void setMailId(String mailId) {
		this.mailId = mailId;
	}



	public AddressDto getAddress() {
		return address;
	}



	public void setAddress(AddressDto address) {
		this.address = address;
	}



	public String toString() {
		return "ResumeDto [name=" + name + ", fatherName=" + fatherName + ", dob=" + dob + ", phoneNumber="
				+ phoneNumber + ", mailId=" + mailId + ", address=" + address + "]";
	}  
	
	
  	
	

}
