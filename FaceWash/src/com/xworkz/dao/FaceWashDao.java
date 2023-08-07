package com.xworkz.dao;

import com.xworkz.dto.FaceWashDto;

public class FaceWashDao {
	
	FaceWashDto[] wash = new FaceWashDto[10];
	
	
	
	public FaceWashDto[] saveDetails(FaceWashDto dto) {
		
		if(dto!=null) {
			for(int i=0;i<wash.length;i++) {
				if(wash[i] == null) {
					wash[i] = dto;
					return wash;
				}
			}
		}
		return wash;
		
		
	}
	
	public FaceWashDto[] readWash() {
		return wash;
	}
	
	
	public FaceWashDto[] updatepriceByname(String chname,int price) {
		if(wash!=null) {
			for(int i=0;i<wash.length;i++) {
				if(wash[i]!=null) {
					if(wash[i].getName()!=null) {
						if(wash[i].getName().equals(chname)) {
							wash[i].setPrice(price);
							System.out.println("cost updated");
							return wash;
						}
					}
				}
				
			}
		}
		return wash;
	}
	
	public FaceWashDto[] searchplatformByname(String seaName,String frPlatform) {
		for(int i=0;i<wash.length;i++) {
			if(wash[i].getName().equals(seaName)) {
				if(wash[i].getPlatform().equals(frPlatform)) {
					System.out.println("searched");
					return wash;
				}
			}
		}
		return wash;
	}
	

	public boolean deleteByname(String name) {
		for(int i=0;i<wash.length;i++) {
			wash[i]=null;
			System.out.println("deleted");
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	

}
