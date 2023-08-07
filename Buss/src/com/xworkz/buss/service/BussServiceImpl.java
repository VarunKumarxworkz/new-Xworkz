package com.xworkz.buss.service;

import com.xworkz.buss.dto.BussDto;
import com.xworkz.buss.repo.BussRepo;
import com.xworkz.buss.repo.BussRepoImpl;

public class BussServiceImpl implements BussService {
	BussRepo repo = new BussRepoImpl();
	@Override
	public boolean save(BussDto dto) {
		if(dto!=null) {
			if(dto.getName()!=null) {
				if(dto.getId()>0) {
					if(dto.getLocation().length()>3) {
						repo.save(dto);
						return true;
					}
					System.out.println("location not valid");
					
				}
				System.out.println("id is lesser then 0");
				return false;
				
			}
			System.out.println("name is null check the name");
			return false;
		}
		System.out.println("dto not null");
		return false;
	}
	@Override
	public BussDto findBylocation(String location) {
		if(location.length()>3){
			System.out.println("finded");
			return repo.findBylocation(location);
		}
		return null;
	}
	@Override
	public boolean updatenameBylocation(String name, String location) {
		if(name.length()>3) {
			System.out.println("updated");
			return repo.updatenameBylocation(name, location);
		}
		
		
		return false;
	}
	@Override
	public BussDto findByname(String name) {
		if(name!=null) {
			System.out.println("finded");
			return repo.findByname(name);
		}
		return null;
	}
	@Override
	public boolean updatenoOfseatsByname(String name, int noOfseats) {
	      if(noOfseats!=0) {
	    	  System.out.println("updated");
	    	  return repo.updatenoOfseatsByname(name, noOfseats);
	      }
		return false;
	}
	@Override
	public boolean deleteByname(String name) {
		if(name!=null) {
			System.out.println("deleted");
			return repo.deleteByname(name);
			
		}
		return false;
	}

}
