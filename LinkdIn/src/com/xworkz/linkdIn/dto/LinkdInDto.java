package com.xworkz.linkdIn.dto;

import java.sql.Date;

import javax.validation.constraints.NotBlank;

public class LinkdInDto {

	private Integer id;
    @NotBlank
    @NotSpace
	private String name;
    @NotBlank
    @NotSpace
	private String fatherName;
    @NotBlank
    @NotSpace
	private Date dateOfBirth;
    @NotBlank
    @NotSpace
	private String qualification;
    @NotBlank
    @NotSpace
	private String emailAddress;
    @NotBlank
    @NotSpace
	private Long phoneNumber;
    @NotBlank
    @NotSpace
	private String languageKnown;
    @NotBlank
    @NotSpace
	private Integer connection;
    @NotBlank
    @NotSpace
	private String skill;
    @NotBlank
    @NotSpace
	private String hobbies;
    @NotBlank
    @NotSpace
	private String areaOfIntrest;
    @NotBlank
    @NotSpace
	private String university;
    @NotBlank
    @NotSpace
	private Float cgpa;
    @NotBlank
    @NotSpace
	private String strength;
    @NotBlank
    @NotSpace
	
	public LinkdInDto() {
		System.out.println("default constructor");
	}
	
	
	
	public LinkdInDto(int id, String name, String fatherName, Date dateOfBirth, String qualification,
			String emailAddress, long phoneNumber, String languageKnown, int connection, String skill, String hobbies,
			String areaOfIntrest, String university, int cgpa, String strength) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.languageKnown = languageKnown;
		this.connection = connection;
		this.skill = skill;
		this.hobbies = hobbies;
		this.areaOfIntrest = areaOfIntrest;
		this.university = university;
		this.cgpa = cgpa;
		this.strength = strength;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth ) {
		this.dateOfBirth =dateOfBirth ;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLanguageKnown() {
		return languageKnown;
	}
	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}
	public int getConnection() {
		return connection;
	}
	public void setConnection(int connection) {
		this.connection = connection;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getAreaOfIntrest() {
		return areaOfIntrest;
	}
	public void setAreaOfIntrest(String areaOfIntrest) {
		this.areaOfIntrest = areaOfIntrest;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "LinkdInDto [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", dateOfBirth=" + dateOfBirth
				+ ", qualification=" + qualification + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
				+ ", languageKnown=" + languageKnown + ", connection=" + connection + ", skill=" + skill + ", hobbies="
				+ hobbies + ", areaOfIntrest=" + areaOfIntrest + ", university=" + university + ", cgpa=" + cgpa
				+ ", strength=" + strength + "]";
	}
	
	
	
	
	
	
	
	
	
}
