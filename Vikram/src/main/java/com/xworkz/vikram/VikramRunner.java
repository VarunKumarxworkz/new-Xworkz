package com.xworkz.vikram;

import com.xworkz.vikram.dto.VikramDto;
import com.xworkz.vikram.service.VikramSerImpl;
import com.xworkz.vikram.service.VikramService;

public class VikramRunner{
	
	
	public static void main(String[] args) {
		
		VikramService service = new VikramSerImpl();
		
		VikramDto dto = new VikramDto(1,"Andavar","Rolex",350,150,1);
		VikramDto dto2= new VikramDto(2,"fagath","santhanam",350,150,1);
		VikramDto dto3= new VikramDto(3,"delhi","Arjundas",350,150,1);
		
		
	    service.save(dto);
	    
		
//		VikramDto vik =service.findByHero("Andavar");
//		System.out.println(vik);
//		service.updateBudgetById(2,180);
//		service.deleteById(3); 
		
	}
}