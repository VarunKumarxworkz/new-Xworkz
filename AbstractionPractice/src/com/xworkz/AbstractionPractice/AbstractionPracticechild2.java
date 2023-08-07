package com.xworkz.AbstractionPractice;

public class AbstractionPracticechild2 extends AbstractionPracticechild1 {

	public void jump() {
		System.out.println("jumping");
	}
	
	public static void main(String[] args) {
		AbstractionPracticechild2 child = new AbstractionPracticechild2();
		
		child.read();
		child.run();
		child.jump(); 
		
	}
	
	
}
