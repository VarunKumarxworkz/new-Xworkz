package com.xworkz.amazon.dto;

public class AmazonDto {
	
	private String firstname;
	private String lastname;;
	private int age;
	private String address;
	private int price;
	private String type;
	
	public AmazonDto() {
		System.out.println("default constructor");
	}

	public AmazonDto(String firstname, String lastname, int age, String address, int price, String type) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
		this.price = price;
		this.type = type;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AmazonDto [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", address=" + address
				+ ", price=" + price + ", type=" + type + "]";
	}

	
	
	

}
