package com.xworkz.backpack.dao;

import com.xworkz.backpack.dto.BackpackDto;

public class BackpackDao {
	
	BackpackDto[] back = new BackpackDto[10];
	
	public BackpackDto[] save(BackpackDto dto) {
		if(dto!=null) {
			for(int i=0;i<back.length;i++) {
				if(back[i]==null) {
					back[i] = dto;
					System.out.println("saved");
					return back;
				}
			}
		}
		return back;
	}
	public BackpackDto[] readBackpack() {
		return back;
	}
	

}
