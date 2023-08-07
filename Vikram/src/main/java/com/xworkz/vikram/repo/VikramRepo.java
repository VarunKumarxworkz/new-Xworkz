package com.xworkz.vikram.repo;

import java.util.List;

import com.xworkz.vikram.dto.VikramDto;

public interface VikramRepo {

	public boolean save(VikramDto dto);
	public List<VikramDto> readAll();
	public VikramDto findByHero(String hero);
	public boolean updateBudgetById(int id,int Budget);
	public boolean deleteById(int id);
	
	
	
}
