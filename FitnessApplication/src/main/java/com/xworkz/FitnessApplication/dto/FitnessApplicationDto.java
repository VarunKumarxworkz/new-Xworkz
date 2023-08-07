package com.xworkz.FitnessApplication.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FitnessApplicationDto {
	
	private String name;
	@NotEmpty
	@NotBlank
	@NotNull
	private String age;
	@NotEmpty
	@NotBlank
	@NotNull
	private String height;
	@NotEmpty
	@NotBlank
	@NotNull
	private String weight;
	@NotEmpty
	@NotBlank
	@NotNull
	private String BMI;
	@NotEmpty
	@NotBlank
	@NotNull
	private String packages;
	@NotEmpty
	@NotBlank
	@NotNull
	private String timing;
	@NotEmpty
	@NotBlank
	@NotNull
	private String experience;
	@NotEmpty
	@NotBlank
	@NotNull
	private String email;
	@NotEmpty
	@NotBlank
	@NotNull
	private String contact;
	@NotEmpty
	@NotBlank
	@NotNull
	private String address;
	@NotEmpty
	@NotBlank
	@NotNull
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBMI() {
		return BMI;
	}
	public void setBMI(String bMI) {
		BMI = bMI;
	}
	public String getPackages() {
		return packages;
	}
	public void setPackages(String packages) {
		this.packages = packages;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contct) {
		this.contact = contct;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "FitnessApplicationDto [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", BMI=" + BMI + ", packages=" + packages + ", timing=" + timing + ", experience=" + experience
				+ ", email=" + email + ", contact=" + contact + ", address=" + address + "]";
	}
	
	

}
