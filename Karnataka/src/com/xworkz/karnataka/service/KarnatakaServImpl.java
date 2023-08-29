package com.xworkz.karnataka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.karnataka.dto.KarnatakaDto;
import com.xworkz.karnataka.repo.KarnatakaRepo;
@Component
public class KarnatakaServImpl implements KarnatakaServ  {
	@Autowired
     KarnatakaRepo repo;
	 
	public boolean save(KarnatakaDto dto) {
		System.out.println("Saved da");
//		repo.save(dto);
		return repo.save(dto);
	}

}
