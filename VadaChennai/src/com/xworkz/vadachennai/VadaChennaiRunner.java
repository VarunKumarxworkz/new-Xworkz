package com.xworkz.vadachennai;

import com.xworkz.vadachennai.dao.VadaChennaiDao;
import com.xworkz.vadachennai.dao.VadaChennaiImp;
import com.xworkz.vadachennai.dao.ValueNotFoundException;

public class VadaChennaiRunner {
	
	public static void main(String[] args)throws ValueNotFoundException {
		
		VadaChennaiDao dao = new VadaChennaiImp();
		
		System.out.println("-----------save---------------");	
		dao.Save(null,50,40,"vetriMaran");
		dao.Save("Dhanush",50, 40, "vetriMaran");
		System.out.println("-----------read---------------");		
		dao.Read();
		System.out.println("-----------update---------------");
		dao.Update();
		System.out.println("-----------delete---------------");
		dao.delete();
		
	}

}
