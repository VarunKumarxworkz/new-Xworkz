package com.xworkz.steroids;

public class SteroidsRunner {
	public static void main(String[] args) {
		//Annonums
		//Dianabol dai = new Dianabol() {
		//	public void MassGain() {
			//	System.out.println("it will gain muscle");
			//}
		//};
		Dianabol dai  = ()->{
			System.out.println("it will gain mass");
			
		};
		dai.MassGain();
		
		
		DecaDurabol dec = ()->{
			System.out.println("it cutts your muscleMass you");
			
		};
		dec.Cutting();
		
		
		Ternboline tren = ()->{
			System.out.println("it will gain muscleMass");
			
		};
		tren.MuscleMass();
	}

}
