package com.xworkz.creatine.dao;

import com.xworkz.creatine.dto.CreatineDto;

public class CreatineDao {

	CreatineDto[] supple = new CreatineDto[10];
	
	
public CreatineDto[] saveDetails(CreatineDto dto) {
	
	if(dto!=null) {
		for(int i=0;i<supple.length;i++) {
			if(supple[i] == null) {
				supple[i] = dto;
				System.out.println("values are executed");
				return supple;
			}
		}
	}
	return supple;
}
   public CreatineDto[] readSupple() {
	return supple;
	
}
	
	public boolean updateCostByName(String name,int cost) {
		for(int i=0;i<supple.length;i++) {
			if(supple[i].getbrand().equals(name)) {
				supple[i].setCost(cost);
				return true;
			}
		}
		return false;
	}		
		
		
public boolean deleteByBrand(String deletebrand) {
	for(int i=0;i<supple.length;i++) {
		if(supple[i].getbrand().equals( deletebrand)) {
			supple[i].setbrand(null);
			return true;
		}
	}
	return false;
	
}
		
public boolean searchBytype(String searchType) {
	for(int i=0;i<supple.length;i++) {
		if(supple[i].getType().equals(searchType)) {
			return true;
		}
	}
	return false;
}


		
		
		
		
		
	}
		