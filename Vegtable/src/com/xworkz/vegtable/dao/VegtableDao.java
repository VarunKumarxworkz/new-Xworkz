package com.xworkz.vegtable.dao;

import com.xworkz.vegtable.dto.VegtableDto;

public class VegtableDao {

	VegtableDto[] veg = new VegtableDto[10];
	
	
	public VegtableDto[] saveMethod(VegtableDto dto) {
		if(dto!=null) {
			for(int i=0;i<veg.length;i++) {
				if(veg[i]== null) {
					veg[i] = dto;
					System.out.println("DETAILS SAVED");
					return veg;
				}
			}
		}
		return veg;
	}
	
	
	public VegtableDto[] readMethod() {
		return veg;
	}
	
	public  VegtableDto[] updatecostByname(String name,int cost) {

		for(int i=0;i<veg.length;i++) {
			if(veg[i]!=null) {
				if(veg[i].getName()!=null) {
					
					if(veg[i].getName().equals(name)) {
						veg[i].setCost(cost);
						System.out.println("cost updated by name");
						return veg;
					}
					
				}
			}
		}
		return veg;
		
	}
	
	public boolean findByname(String name) {
		for(int i=0;i<veg.length;i++) {
			if(veg[i].getName().equals(name)) {
				System.out.println("name founded");
				return true;
			}
		}
		return false;
	}
	
	public boolean deletedBymode(String delmode) {
		for(int i=0;i<veg.length;i++) {
			if(veg[i].getMode().equals(delmode)) {
				veg[i].setMode(null);
				System.out.println("mode deleted");
				return true;
			}
		}
		return false;
	}
}