package com.xworkz.karnataka.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.karnataka.dto.KarnatakaDto;
@Component
public class KarnatakaRepoImpl implements KarnatakaRepo{
   @Autowired
	private List<KarnatakaDto> list;
	@Override
	public boolean save(KarnatakaDto dto) {
		System.out.println("saved");
//		list.add(dto);
		return list.add(dto);
	}

}
