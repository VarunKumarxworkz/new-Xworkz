package com.xworkz.vegetables.dao;

import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesDao {

	VegetablesDto[] veg = new VegetablesDto[10];
	
	
public VegetablesDto[] saveDetails(VegetablesDto dto) {
	
		for(int i=0;i<veg.length;i++) {
			if(veg[i] == null) {
				veg[i] = dto;
				System.out.println("values are executed");
				return veg;
			}
		}
		return veg;
}

	
	
	
public VegetablesDto[] readveg() {
	return veg;
}

public boolean findByName(String findnmae) {
	for(int i=0;i<veg.length;i++) {
		if(veg[i].getName().equals(findnmae)) {
			System.out.println("name is finded successfully ");
			return true;
		}
	}
	return false;
	
}

public boolean deleteByName(String deleName) {
	for(int i=0;i<veg.length;i++) {
		if(veg[i].getName().equals(deleName)) {
			veg[i].setName(null);
			System.out.println("name is deleted successFully");
			return true;
		}
	}
	return false;
}
public boolean deleteByIndex(int index) {
	if(index<veg.length) {

	veg[index] = null;
	return true;
}
	return false;
}


	
}