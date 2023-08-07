package com.xworkz.ihff.dao;

import com.xworkz.ihff.dto.IhffDto;

public class IhffDao {

	IhffDto[] comp = new IhffDto[10];
	
	
	
	
public IhffDto[] saveDetails(IhffDto dto) {
	if(dto!=null) {
		for(int i=0;i<comp.length;i++) {
			if(comp[i]== null) {
				comp[i]=dto;
				System.out.println("Details are Saved");
				return comp;
			}
		}
	}
	return comp;
}

public IhffDto[] readComp() {
	return comp;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
