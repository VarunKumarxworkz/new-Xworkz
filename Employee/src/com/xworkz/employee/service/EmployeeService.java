package com.xworkz.employee.service;

import java.util.List;

import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeService {
	public boolean  save(EmployeeDto dto);
	public EmployeeDto findByName(String name);
	public EmployeeDto findByNameAndAge(String name,int age);
	public boolean  updateAgeByFatherName(int Age,String Name);
	public boolean updateAddressByGenderAndExperience(String Address,String Gender,int Experience);
	public boolean DeleteByEmail(String Email);
	public boolean DeleteByQualificationAndMaritalStatus(String Qualification,String MaritalStatus);
	public List<EmployeeDto> ReadAll();

}
