package com.xworkz.creatine;

import com.xworkz.creatine.dao.CreatineDao;
import com.xworkz.creatine.dto.CreatineDto;

public class CreatineRunner {

	public static void main(String[] args) {
		
		CreatineDto dto = new CreatineDto("MB",1200,"mono","good");
		CreatineDao dao = new CreatineDao();
		
		dao.saveDetails(dto);
		
		CreatineDto[] crea = dao.readSupple();
		for(int i=0;i<crea.length;i++) {
			if(crea[i]!=null) {
				System.out.println(crea[i]);	
			}
		}
		
		dao.updateCostByName("MB", 1500);
		CreatineDto[] crr = dao.readSupple();
		for(int i=0;i<crr.length;i++) {
			if(crr[i]!=null) {
				System.out.println(crr[i]);	
			}
		}
		dao.deleteByBrand("MB");
		
		CreatineDto[] crt = dao.readSupple();
		for(int i=0;i<crt.length;i++) {
			if(crt[i]!=null) {
				System.out.println(crt[i]);	
			}
		}

       dao.searchBytype("mono");		
       System.out.println("..................................");	

       CreatineDto[] syr = dao.readSupple();
		for(int i=0;i<syr.length;i++) {
			if(syr[i]!=null) {
				System.out.println(syr[i]);	
			}
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
