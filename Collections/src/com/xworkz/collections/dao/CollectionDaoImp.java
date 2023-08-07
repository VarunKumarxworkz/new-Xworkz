package com.xworkz.collections.dao;

import java.util.ArrayList;

public class CollectionDaoImp implements CollectionDao {
	
	
	ArrayList list01 = new ArrayList();

	@Override
	public Integer Save(String name,int value,int size,String brand) throws notValidException {
      if(name!=null) {
		list01.add(name);
		list01.add(value);
		list01.add(size);
		list01.add(brand);
		System.out.println("saved");
      }
      else {
    	  throw new notValidException("list is null check the list");
      }
		
		return 0;
	}

	@Override
	public Boolean read() {
		for(Object obj:list01) {
			System.out.println(obj);
		}
		return false;
	}

	@Override
	public Boolean update() {
		list01.set(1,2);
		System.out.println("updated");
		read();
		return false;
	}

	@Override
	public Boolean  delete() {
		list01.remove(1);
		read();
		return false;
	}

}
