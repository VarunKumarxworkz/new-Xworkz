package com.xworkz.mobiles;

import com.xworkz.mobiles.dao.MobilesImp;
import com.xworkz.mobiles.dao.MobilesRepo;

public class Runner {
	public static void main(String[] args) {
		
	
	MobilesRepo dao = new MobilesImp();
	dao.Save("VIVo","vivo","bigShop");
	System.out.println("-----saved-----");
	
	dao.Read();
	System.out.println("-------readed-----");
	
	dao.Update();
	System.out.println("--------Updated-----");
	
	dao.Delete();
	System.out.println("------dELETED-------");
	
	
	
	}	
}
