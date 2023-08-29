package com.xworkz.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.repo.EmployeeRepo;
@Component
public class EmployeeServImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public boolean save(EmployeeDto dto) {
		if(dto!=null) {
			if(dto.getName().length()>3) {
				if(dto.getFatherName().length()>3) {
					if(dto.getGender()!=null) {
						if(dto.getAge()!=0) {
						if(dto.getQualification().equals("B.E")) {
						if(dto.getLanuageKnown()!=null) {
						if(dto.getEmail()!=null) {
							if(dto.getAddress()!=null) {
								if(dto.getExperience()!=0) {
									if(dto.getMaritalStatus()!=null) {
										repo.save(dto);
										return true;
									}
									System.out.println("Marital status is Must");
									return false;
								}
								System.out.println("Experience  is not valid");
								return false;
							}
							System.out.println("Address is not valid");
							return false;
						}
						System.out.println("Email is not valid");
						return false;
						}
						System.out.println("Language Know is Null");
						return false;
							
						}
						System.out.println("Qualification is not valid");
						return false;
						}
						System.out.println("Age is Not Valid");
						return false;
					}
					System.out.println("Gender is Null");
					return false;
				}
				System.out.println("Father name is not valid");
				return false;
			}
			System.out.println("name is not valid");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public EmployeeDto findByName(String name) {
		if(name!=null) {
			System.out.println("Finded By Name");
			return repo.findByName(name);
		}
		return null;
	}

	@Override
	public EmployeeDto findByNameAndAge(String name, int age) {
		if(name!=null) {
			if(age!=0) {
				return repo.findByNameAndAge(name, age);
			}
		}
		return null;
	}

	@Override
	public boolean updateAgeByFatherName(int Age, String Name) {
		if(Age!=0) {
			if(Name!=null) {
				return repo.updateAgeByFatherName(Age, Name);
			}
		}
		return false;
	}

	@Override
	public boolean updateAddressByGenderAndExperience(String Address, String Gender, int Experience) {
		if(Address!=null){
			if(Gender!=null) {
				if(Experience!=0) {
					return repo.updateAddressByGenderAndExperience(Address, Gender, Experience);
				}
			}
		}
		return false;
	}

	@Override
	public boolean DeleteByEmail(String Email) {
	if(Email!=null) {
		return repo.DeleteByEmail(Email);
	}
		return false;
	}

	@Override
	public List<EmployeeDto> ReadAll() {
		
		return repo.ReadAll();
	}

	@Override
	public boolean DeleteByQualificationAndMaritalStatus(String Qualification, String MaritalStatus) {
	    if(Qualification!=null) {
	    	return repo.DeleteByQualificationAndMaritalStatus(Qualification, MaritalStatus);
	    }
		return false;
	}

}
