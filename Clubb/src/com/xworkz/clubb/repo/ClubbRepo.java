package com.xworkz.clubb.repo;

import com.xworkz.clubb.dto.ClubbDto;

public interface ClubbRepo {
	
	public boolean save(ClubbDto dto);
	public ClubbDto read(int id);
//	public ClubbDto updateNameByid(String name,int id);
	public ClubbDto updateByname(String name);

}
