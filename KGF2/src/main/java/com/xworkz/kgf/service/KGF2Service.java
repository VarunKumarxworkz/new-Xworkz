package com.xworkz.kgf.service;

import com.xworkz.kgf.dto.KGF2Dto;

public interface KGF2Service {
	public boolean save(KGF2Dto dto);
	public KGF2Dto findByHero(String hero);
	public  KGF2Dto findById(int id);

}
