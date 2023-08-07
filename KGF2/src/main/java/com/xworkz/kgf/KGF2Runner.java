package com.xworkz.kgf;

import com.xworkz.kgf.dto.KGF2Dto;
import com.xworkz.kgf.service.KGF2ServImpl;
import com.xworkz.kgf.service.KGF2Service;

public class KGF2Runner {
	
	public static void main(String[] args) {
		KGF2Dto dto = new KGF2Dto(1,"rocky","garuda",800,400,2);
		KGF2Dto dto1 = new KGF2Dto(2,"yash","Adhira",800,400,2);
		KGF2Dto dto2 = new KGF2Dto(3,"rajakrishna","SuryaVardhan",800,400,2);
		KGF2Service service  = new KGF2ServImpl();
		
		
//		service.save(dto2);
		
//		service.findByHero("'rocky'");
//		service.findById(1);
	}

}
