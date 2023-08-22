package com.xwork.chainingconstructor.sup;

public class Chaning2 {

	public Chaning2() {
//		super();
		this(2.3f);
		System.out.println("default");
	}
	public Chaning2(float ratio) {
		this("red");
		System.out.println(ratio);
	}
	public Chaning2(String color) {
		System.out.println(color);
	}
}
