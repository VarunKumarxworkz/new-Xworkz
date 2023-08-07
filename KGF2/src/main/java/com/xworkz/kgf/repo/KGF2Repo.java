package com.xworkz.kgf.repo;

import com.xworkz.kgf.dto.KGF2Dto;
public interface KGF2Repo {
	
public boolean save(KGF2Dto dto);
public KGF2Dto findByHero(String hero);
public  KGF2Dto findById(int id);
public boolean updateBudgetById(int id,int Budget);
public boolean deleteById(int id);

}
