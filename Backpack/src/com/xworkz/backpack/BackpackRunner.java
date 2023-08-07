package com.xworkz.backpack;

import com.xworkz.backpack.constant.Type;
import com.xworkz.backpack.dao.BackpackDao;
import com.xworkz.backpack.dto.BackpackDto;
import com.xworkz.backpack.dto.DesignDto;

public class BackpackRunner {
	public static void main(String[] args) {
	
	DesignDto desgn = new DesignDto("printed",300,4,"black");
	
	BackpackDto dto = new BackpackDto("american",1200,Type.travelbag,desgn,"VArun");
	
	BackpackDao daoo = new BackpackDao();

	BackpackDto[] pack = daoo.save(dto);
	
	BackpackDto[] bag = daoo.readBackpack();
	
	for(int i=0;i<bag.length;i++) {
		if(bag[i]!=null) {
		System.out.println(bag[i]);	
		}
		
	}

	}
}
