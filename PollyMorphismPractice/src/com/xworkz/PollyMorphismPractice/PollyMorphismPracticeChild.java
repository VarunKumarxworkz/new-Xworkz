package com.xworkz.PollyMorphismPractice;

public class PollyMorphismPracticeChild extends PollyMorphismPractice {
	
	
	public PollyMorphismPracticeChild(int price, String name, String address, int budget) {
		super(price, name, address, budget);
		
	}

	public static void main(String[] args) {
		PollyMorphismPractice prac = new PollyMorphismPractice(200,"nike","BTM",500);
		//PollyMorphismPracticeChild poly = new PollyMorphismPracticeChild();
		
		//prac.read(2);
		//poly.read("varun");
		
	//System.out.println(prac);	
		
		
		
		
	}
	

}
