package com.xworkz.leo.reepo;

import java.util.List;

import com.xworkz.leo.dto.LeoDto;

public interface LeoRepo {
	
	public boolean save(LeoDto dto);
	
	public List<LeoDto>  findByHeroName(String heroName);

}
