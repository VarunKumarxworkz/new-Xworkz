package com.xworkz.collections;

import java.util.ArrayList;

import com.xworkz.collections.dao.notValidException;

public class Collections {
	
	public static void main(String[] args) throws notValidException {
		
		ArrayList ary = new ArrayList();
		
		
		ary.add("hi");
		ary.add("hello");
		ary.remove("hi");
		ary.set(0,"namaskar");
		ary.get(0);
		
		Object values = ary.get(0);
		System.out.println(values);
	}
	

}
