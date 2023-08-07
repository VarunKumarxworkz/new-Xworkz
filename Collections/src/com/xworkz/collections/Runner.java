package com.xworkz.collections;

import com.xworkz.collections.dao.CollectionDao;
import com.xworkz.collections.dao.CollectionDaoImp;
import com.xworkz.collections.dao.notValidException;

public class Runner {
	public static void main(String[] args) throws notValidException {
		CollectionDao dao = new CollectionDaoImp();
		
		//dao.Save(null, 0, 0, null);
		dao.Save("varun", 1, 2, "pro");
		dao.read();
		
		dao.update();
		dao.delete();
		
		
		
		
		
		
		
		
		
	}

}
