package com.xworkz.kgf.service;

import com.xworkz.kgf.dto.KGF2Dto;
import com.xworkz.kgf.repo.KGF2RepImpl;
import com.xworkz.kgf.repo.KGF2Repo;

public class KGF2ServImpl implements KGF2Service {
	KGF2Repo repo = new KGF2RepImpl();
	@Override
	public boolean save(KGF2Dto dto) {
		if(dto.getHero()!=null) {
		System.out.println("saved");
		return repo.save(dto);
		}
		return false;
	}
	@Override
	public KGF2Dto findByHero(String hero) {
		if(hero!=null) {
			System.out.println("finded");
		}
		return repo.findByHero(hero);
	}
	@Override
	public KGF2Dto findById(int id) {
		if(id!=0) {
			System.out.println("finded");
			return repo.findById(id);
		}
		return null;
	}

}
