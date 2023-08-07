package com.xworkz.vadachennai.dao;

import java.util.LinkedList;

public class VadaChennaiImp implements VadaChennaiDao {
	
	LinkedList list = new LinkedList();

	@Override
	public Integer Save(String Hero, int BoxOfficeCollection, int Invest, String Director)throws ValueNotFoundException  {
		if(Hero!=null) {
		list.add(Director);
		list.add(Hero);
		list.add(BoxOfficeCollection);
		list.add(Invest);
		list.add(Director);
		}
		else {
			throw new ValueNotFoundException("Check the null value");
		}
		System.out.println("saved sucessfully");
		return Invest;
	}
	

	@Override
	public Integer Read() {
		for(Object obj:list) {
			System.out.println(obj);
		}
		return 10;
	}

	@Override
	public Integer Update() {
		list.set(2,"Heroin");
		Read();
		System.out.println("updated");
		return null;
	}

	@Override
	public boolean delete() {
    list.remove(2);
    Read();
    System.out.println("deleted");
		return false;
	}


	

}
