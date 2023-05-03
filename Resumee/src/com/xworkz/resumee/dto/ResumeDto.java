package com.xworkz.resumee.dto;


public class ResumeDto {
	private String Name;
	private String DOB;
	private String Fathername;
	private long mobileNo;
	private int age;
	private String Email;
	private int passedout;
	private String degree;
	private AddressDto address;
	public ResumeDto(String name, String dOB, String fathername, long mobileNo, int age, String email, int passedout,
			String degree, AddressDto address) {
		super();
		Name = name;
		DOB = dOB;
		Fathername = fathername;
		this.mobileNo = mobileNo;
		this.age = age;
		Email = email;
		this.passedout = passedout;
		this.degree = degree;
		this.address = address;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getFathername() {
		return Fathername;
	}

	public void setFathername(String fathername) {
		Fathername = fathername;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPassedout() {
		return passedout;
	}

	public void setPassedout(int passedout) {
		this.passedout = passedout;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}
	 
	public String toString() {
		return "ResumeDto [Name=" + Name + ", DOB=" + DOB + ", Fathername=" + Fathername + ", mobileNo=" + mobileNo
				+ ", age=" + age + ", Email=" + Email + ", passedout=" + passedout + ", degree=" + degree + ", address="
				+ address + "]";
	}

	
	
	

}
