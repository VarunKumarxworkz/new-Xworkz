package com.xworkz.vikram.service;

import com.xworkz.vikram.dto.VikramDto;
import com.xworkz.vikram.repo.VikramRepo;
import com.xworkz.vikram.repo.VikramRepoImpl;

public class VikramSerImpl implements VikramService {

	VikramRepo repo = new VikramRepoImpl();

	@Override
	public boolean save(VikramDto dto) {
		//repo.save(dto);//
		return repo.save(dto);
	}

	@Override
	public VikramDto findByHero(String hero) {
		if(hero!=null) {
		System.out.println("finded");
		return repo.findByHero(hero);
		}
		return null;
	}

	@Override
	public boolean updateBudgetById(int id, int Budget) {
		if(Budget!=0) {
			System.out.println("updated");
			return repo.updateBudgetById(id, Budget);
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id!=0) {
			System.out.println("deleted");
			return repo.deleteById(id);
		}
		return false;
	}
	
	
	
	
}
