package com.xworkz.vikram.service;

import com.xworkz.vikram.dto.VikramDto;

public interface VikramService {

	public boolean save(VikramDto dto);
	public VikramDto findByHero(String hero);
	public boolean updateBudgetById(int id,int Budget);
	public boolean deleteById(int id);
}
