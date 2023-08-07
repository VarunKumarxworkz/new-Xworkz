package com.xworkz.Kadamban.dao;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.Kadamban.dto.KadambanDto;

public class KadambanImp implements KadambanRepo {

	Set<KadambanDto> set = new HashSet<KadambanDto>();

	@Override
	public KadambanDto save(KadambanDto dto) {
	set.add(dto);

		return dto;
	}

	@Override
	public KadambanDto read() {
		for(Object obj:set) {
			System.out.println(obj);
		}
		return null ;
	}

	@Override
	public boolean delete(KadambanDto dto) {
		set.remove(dto);
		return false;
	}

	
	
	
	
	
}
