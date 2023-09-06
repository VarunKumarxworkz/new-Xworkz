package com.xworkz.leo.serv;

import java.util.List;

import com.xworkz.leo.dto.LeoDto;

public interface LeoServ {

	public boolean save(LeoDto dto);
	public List<LeoDto> findByHeroName(String heroName);
	
	public boolean doExist(String heroName);
}
