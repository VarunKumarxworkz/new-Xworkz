package com.xworkz.oopsprogramming;

public class MenPhysique extends Fitness {

	int CreatineRate;
	int ProtienCost;
	
	public MenPhysique(int CreatineRate,int ProtienCost) {
		this.CreatineRate = CreatineRate;
		this.ProtienCost = ProtienCost;
	}
	
public void UseCreatine() {
	System.out.println("ForMuscleMass");
}
public void UseProtien() {
	System.out.println("ForRecovery");
}

	
	
}
