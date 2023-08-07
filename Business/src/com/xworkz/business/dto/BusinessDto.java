package com.xworkz.business.dto;


public class BusinessDto {
	
	private int id;
	private String name;
	private int age;
	private String qualification;
	private String email;
	private String languageKnown;
	private int experience;
	private String skill;
	private int salary;
	private String branches;
	
	public BusinessDto() {
		System.out.println("defAULT Constructor");
	}
	public BusinessDto(int id, String name, int age, String qualification, String email, String languageKnown,
			int experience, String skill, int salary, String branches) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.email = email;
		this.languageKnown = languageKnown;
		this.experience = experience;
		this.skill = skill;
		this.salary = salary;
		this.branches = branches;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLanguageKnown() {
		return languageKnown;
	}
	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBranches() {
		return branches;
	}
	public void setBranches(String branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "BusinessDto [id=" + id + ", name=" + name + ", age=" + age + ", qualification=" + qualification
				+ ", email=" + email + ", languageKnown=" + languageKnown + ", experience=" + experience + ", skill="
				+ skill + ", salary=" + salary + ", branches=" + branches + "]";
	}
	
	 
	
	
	

}
