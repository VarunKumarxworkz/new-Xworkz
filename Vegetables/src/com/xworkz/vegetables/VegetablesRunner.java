package com.xworkz.vegetables;

import com.xworkz.vegetables.constant.VegetablesType;
import com.xworkz.vegetables.dao.VegetablesDao;
import com.xworkz.vegetables.dto.NutrientsDto;
import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesRunner {
  
	public static void main(String[] args) {
		
		NutrientsDto nutr = new NutrientsDto(1,10,2,41);
		
		
	VegetablesDto dto = new VegetablesDto("carrot",60,nutr,VegetablesType.rawEatable,"orange");
	VegetablesDao dao = new VegetablesDao();
	
	System.out.println("....................SAVED SUCCESFULLY..............");
	
     dao.saveDetails(dto);
	
    VegetablesDto[] learn = dao.readveg();
    for(int i=0;i<learn.length;i++) {
    	if(learn[i]!=null) {
    		System.out.println(learn[i]);
    	}		
    	
    }
    
    System.out.println("....................FIND BY NAME..............");
    
    dao.findByName("carrot");
    

    VegetablesDto[] nam = dao.readveg();
    for(int i=0;i<nam.length;i++) {
    	if(nam[i]!=null) {
    		System.out.println(nam[i]);
    
    
    	}	
}
    System.out.println("...................DELETED BY NAME ..............");
    dao.deleteByName("carrot");
    
    VegetablesDto[] del = dao.readveg();
    for(int i=0;i<del.length;i++) {
    	if(del[i]!=null) {
    		System.out.println(del[i]);
    
    
    	}	
} 
    
  dao.deleteByIndex(3);  
    
  VegetablesDto[] del1 = dao.readveg();
  for(int i=0;i<del1.length;i++) {
  	if(del1[i]!=null) {
  		System.out.println(del1[i]);
  
  
  	}	
} 
  

    
	}
}