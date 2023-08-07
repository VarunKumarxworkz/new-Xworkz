package com.xworkz.clubb.service;

import com.xworkz.clubb.dto.ClubbDto;

public interface ClubbService {
	public boolean save(ClubbDto dto);
	public ClubbDto read(int id);
//	public ClubbDto updateNameByid(String name,int id);
	public ClubbDto update(ClubbDto dto);
}
