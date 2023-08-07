package com.xworkz.ihff;

import com.xworkz.ihff.constant.Type;
import com.xworkz.ihff.dao.IhffDao;
import com.xworkz.ihff.dto.IhffDto;
import com.xworkz.ihff.dto.IhffRulesDto;

public class IhffRunner {
  
	public static void main(String[] args) {
		
		IhffRulesDto physiq = new IhffRulesDto(178,90,30,53);
		
		IhffDto dto = new IhffDto("MenPhysique","RajaAjith",176,physiq,Type.menPhysique);
		
		IhffDao dao = new IhffDao();
		
		
		dao.saveDetails(dto);
		
		
		
		IhffDto[] ref = dao.readComp();
		for(int i=0;i<ref.length;i++) {
				System.out.println(ref[i]);
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
