package com.xworkz.Kadamban;

import com.xworkz.Kadamban.dao.KadambanImp;
import com.xworkz.Kadamban.dao.KadambanRepo;
import com.xworkz.Kadamban.dto.KadambanDto;

public class KadambanRunner {
	public static void main(String[] args) {
		KadambanDto dto = new KadambanDto("kadamban","Arya","TErsa","RAgavan","Rana",25,5,"kadamban");
		//KadambanDto dto2 = new KadambanDto("kadamban","Arya","TErsa","RAgavan","Rana",25,5,"kadamban");
		//KadambanDto dto1 = new KadambanDto("kadamban","Arya","TErsa","RAgavan","Rana",25,5,"kadamban");
		
		//KadambanDto dto1=dto;
		
		
		
		KadambanRepo repo = new KadambanImp();
		
			 
		repo.save(dto);
		//repo.save(dto1);
		//repo.save(dto2);
		//repo.Save(dto1);
		
		//repo.read();
		repo.read();
		repo.delete(dto);
		System.out.println("--------------------");
		repo.read();
		
	}

}
