package com.xworkz.fashion;

import com.xworkz.fashion.dao.FashionImp;
import com.xworkz.fashion.dao.FashionInt;

public class Runner {

	public static void main(String[] args) {
		
		FashionInt dao = new FashionImp();
		
		dao.Save("nike", 5000, 1500000);
		System.out.println("--------readed-----");
		dao.Read();
		System.out.println("--------updated----");
		dao.Update();
		System.out.println("--------Deleted--------");
		dao.Delete();
	}
	
}
