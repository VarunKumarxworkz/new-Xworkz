package com.xworkz.facewash;

import com.xworkz.constant.Type;
import com.xworkz.dao.FaceWashDao;
import com.xworkz.dto.FaceWashDto;
import com.xworkz.dto.IngredientDto;

public class FaceWashRunner {
	
	public static void main(String[] args) {
		
		IngredientDto ingre = new IngredientDto("glycine",25,500);
		FaceWashDto dto = new FaceWashDto("mamaearth",500,Type.herbal,ingre,"online");
		FaceWashDao dao = new FaceWashDao();
		
		dao.saveDetails(dto);
	
		
		FaceWashDto[] rea = dao.readWash();
		for(int i=0;i<rea.length;i++) {
			if(rea[i]!=null) {
				System.out.println(rea[i]);
			}
		}
		
		dao.updatepriceByname("mamaearth", 800);
		FaceWashDto[] roa = dao.readWash();
		for(int i=0;i<roa.length;i++) {
			if(roa[i]!=null) {
				System.out.println(roa[i]);
			}
		}
	    
		dao.searchplatformByname("mamaearth","online");
		FaceWashDto[] hea = dao.readWash();
		for(int i=0;i<hea.length;i++) {
			if(hea[i]!=null) {
				System.out.println(hea[i]);
			}
		}
        dao.deleteByname("mamaearth");
		FaceWashDto[] dsa = dao.readWash();
		for(int i=0;i<dsa.length;i++) {
			if(dsa[i]!=null) {
				System.out.println(dsa[i]);
			}
		}

		
		
		
		
	}
	

}
