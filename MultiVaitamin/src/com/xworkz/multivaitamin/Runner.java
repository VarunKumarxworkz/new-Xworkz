 package com.xworkz.multivaitamin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		MultiVaitaminrep multi = (b,p)-> {
			
			System.out.println("Multivitamin printed");
			
			System.out.println(b);
	
			return p+100;
		};	
		
		
	int values = multi.multiVaitamins("mb",1200);
		
		System.out.println(values);
		
		
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("Mb");
		list.add("on");
		list.add("iso");
		list.add("whey");
		
		MyComparator comp = (o1,o2)->{
			if(o1.length()>o2.length()) {
				return 1;
			}
			else {
				return -1;
			}
		};
		
		Collections.sort(list,comp);
		
		list.forEach((pro)->{System.out.println(pro);});
		
	}

}
