package com.xworkz.dainabol;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void  main(String[] args) {
		
		DainabolRepo muscle = (n,p)->{
			
			System.out.println(n);
			
			return p+100;
			
		};
		
		int values = muscle.MuscleGain("TrenA", 2300);
		System.out.println(values);
		
	}
	
	List<String> list = new ArrayList<String>();
	
	list.add("tren");
	
	
	
	

}
