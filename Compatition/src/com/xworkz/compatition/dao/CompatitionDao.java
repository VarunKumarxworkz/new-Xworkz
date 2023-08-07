package com.xworkz.compatition.dao;

import com.xworkz.compatition.dto.CompatitionDto;

public class CompatitionDao {

	CompatitionDto[] comp = new CompatitionDto[10];
	
	public CompatitionDto[] saveDetails(CompatitionDto dto) {
		if(dto!=null) {
			for(int i=0;i<comp.length;i++) {
				if(comp[i]==null) {
					comp[i] = dto;
					return comp;		
				}
			}
		}
		return comp;
		
	}
	
	public CompatitionDto[] readComp() {
		return comp;
	}
	
	
	
	
	
	
}
