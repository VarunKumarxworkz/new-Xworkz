package com.xworkz.employee.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Table(name = "employe")
@Entity
@NamedQuery(name="findByName",query = "select dto from EmployeeDto dto where dto.name=:nm ")
@NamedQuery(name="findByNameAndAge",query = "select dto from EmployeeDto dto where dto.name=:nam and dto.age=:ag")
@NamedQuery(name="updateAgeByFatherName",query = "update EmployeeDto dto set dto.age=:aee where dto.fatherName=:fn")
@NamedQuery(name="updateAddressByGenderAndExperience",query = "update EmployeeDto dto set dto.address=:add where dto.gender=:gn and dto.experience=:exp")
@NamedQuery(name= "DeleteByEmail" ,  query ="delete from EmployeeDto dto where email=:em")
@NamedQuery(name= "DeleteByQualificationAndMaritalStatus" ,  query ="delete from EmployeeDto dto where dto.qualification=:qa and dto.maritalStatus=:ms")
@NamedQuery(name="ReadAll" ,query = "select dto from EmployeeDto dto")
public class EmployeeDto {
	@Id
	private int id;
	private String name;
	private String fatherName;
	private String gender;
	private int age;
	private String qualification;
	private String lanuageKnown;
	private String email;
	private String address;
	private int experience;
	private String maritalStatus;
	
	public EmployeeDto() {
		System.out.println("default constructor");
	}

	public EmployeeDto(int id, String name, String fatherName, String gender, int age, String qualification,
			String lanuageKnown, String email, String address, int experience, String maritalStatus) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.gender = gender;
		this.age = age;
		this.qualification = qualification;
		this.lanuageKnown = lanuageKnown;
		this.email = email;
		this.address = address;
		this.experience = experience;
		this.maritalStatus = maritalStatus;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getLanuageKnown() {
		return lanuageKnown;
	}

	public void setLanuageKnown(String lanuageKnown) {
		this.lanuageKnown = lanuageKnown;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", gender=" + gender
				+ ", age=" + age + ", qualification=" + qualification + ", lanuageKnown=" + lanuageKnown + ", email="
				+ email + ", address=" + address + ", experience=" + experience + ", maritalStatus=" + maritalStatus
				+ "]";
	}

	
}
