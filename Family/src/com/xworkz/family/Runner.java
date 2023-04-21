package com.xworkz.family;

import com.xworkz.family.data.DataFamily;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataFamily family = new DataFamily("UmeshFamily",5,"Umesh",3,"NuclearFamily");
		System.out.println(family);
		
		
		
		
		DataFamily family01 = new DataFamily("UmeshFamily",5,"Umesh",3,"NuclearFamily");
		//System.out.println(family01);
		
		System.out.println(family.equals(family01));
		
		
		
		
		
		
		
		
		
	}

}
