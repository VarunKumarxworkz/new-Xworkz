package com.xworkz.resumee.dao;

import com.xworkz.resumee.dto.ResumeDto;

public class ResumeeDao {
	ResumeDto[] resume = new ResumeDto[15];
	
	
	public ResumeDto[] SaveDetails(ResumeDto dto) {
		if (dto != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] == null) {
					resume[i] = dto;
					System.out.println(" Data added ");
					return resume;
				}
				System.out.println("The index have some value");
			}
			System.out.println("All index contains some data");
			return resume;
		}
		System.out.println("The data is null  ");
		return resume;

	}
	public ResumeDto[] ReadResume() {
		return resume;
	}

	public ResumeDto FindByName(String Name) {

		if (Name != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					resume[i].getName().equals(Name);
					System.out.println("name found");
					return resume[i];
				}
				System.out.println("The name not match,so the index will be i++");
			}
			System.out.println("The name is not found");
			return null;
		}
		System.out.println("The given name is null");
		return null;
	}
	
	public ResumeDto FindByEmail(String email) {

		if (email != null ) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if (resume[i].getEmail().equals(email)) {
						System.out.println("email id found");
						return resume[i];
					}
					System.out.println("the  email id not match , index will be i++");
				}
				
			}
			System.out.println("the  email id  not found");
			return null;
		}
		System.out.println("the given email id is null  ");
		return null;

	}

	public boolean UpdateDegreeByName(  String Degree,String name) {

		if (name != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if(resume[i].getName().equals(name)) {
						resume[i].setDegree(Degree);
						System.out.println("degree updated Successfully");
						
						return true;
					}
					System.out.println(" name not found ,index is i++");
					 
				}
                 
			}
			System.out.println(" name not found");
			return false;
		}
		System.out.println(" name not valid");
        return false;   
	}
	
	public boolean UpdatePhoneNumBymail(String  emailid, long phoneNumber) {

		if (emailid!= null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if(resume[i].getEmail().equals(emailid)) {
						resume[i].setMobileNo(phoneNumber);
						System.out.println("Mobile number  updated");
						
						return true;
					}
					System.out.println("  Email not found ,so index is i++");
					 
				}
                 
			}
			System.out.println("email id is not found");
			return false;
		}
		System.out.println(" email id not valid");
        return false;   
	}
	public boolean DeleteAgebyName (String name) {
		if(name != null) {
			for (int i = 0; i < resume.length; i++) {
				if (resume[i] != null) {
					if(resume[i].getName().equalsIgnoreCase(name)) {
						resume[i].setAge(0);
						System.out.println(" Age deleted");
						
						return true;
					}
					System.out.println("  name not found ,so index is i++");
					 
				}
                 
			}
			System.out.println("name not found");
			return false;
			
		}
		System.out.println("name is not valid");
		return false;
	}
	
	
}
