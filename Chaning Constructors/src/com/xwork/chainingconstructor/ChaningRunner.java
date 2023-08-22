package com.xwork.chainingconstructor;

import com.xwork.chainingconstructor.sup.Chaning2;

public class ChaningRunner extends Chaning2 {
	public ChaningRunner(){
//	super();
		this(2000);
		System.out.println("deafult");
	
	}
	
	public ChaningRunner(int price) {
		this(8,"dumbell");
		System.out.println(price);
	}
	
	public ChaningRunner(int size,String name) {
		System.out.println(size);
		System.out.println(name);
	}
	
	public static void main(String[] Args) {
		ChaningRunner run  = new ChaningRunner();
	
	}
	

}
