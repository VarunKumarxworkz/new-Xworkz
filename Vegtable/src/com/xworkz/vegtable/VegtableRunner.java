package com.xworkz.vegtable;

import com.xworkz.vegtable.constant.Type;
import com.xworkz.vegtable.dao.VegtableDao;
import com.xworkz.vegtable.dto.NutrientDto;
import com.xworkz.vegtable.dto.VegtableDto;

public class VegtableRunner {

	public static void main(String[] args) {
		
		NutrientDto nutr = new NutrientDto(2,4,8,56);
		VegtableDto dto = new VegtableDto("carrot",54,Type.cookable,nutr,"offline");
		VegtableDao dao = new VegtableDao();
		
		
		dao.saveMethod(dto);
		
		VegtableDto[] veeeg = dao.readMethod();
		for(int i=0;i<veeeg.length;i++) {
			if(veeeg[i]!=null) {
				System.out.println(veeeg[i]);
			}
		}
		dao.updatecostByname("carrot", 65);
		
		VegtableDto[] veeg = dao.readMethod();
		for(int i=0;i<veeg.length;i++) {
			if(veeg[i]!=null) {
				System.out.println(veeg[i]);
			}
		}
		
		dao.deletedBymode("offline");
		VegtableDto[] vee = dao.readMethod();
		for(int i=0;i<vee.length;i++) {
			if(vee[i]!=null) {
				System.out.println(vee[i]);
			}
		}
	}
	
	
	
	
}
