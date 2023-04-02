package com.xworkz.Hirerchical2;

public class Cricket {
 
	String Tournament;
	byte Players;
	int Score;
	
public void Batsman() {
	System.out.println("ChirshGayle");
}

public static void main(String[] args) {
	
	Football soc = new Football("Ronaldo",11);
	System.out.println(soc.playerName); 
	soc.mobileGame();
	
	Volleyball vol = new Volleyball();
	
	vol.Setter();
	
	Kabbadi kab = new Kabbadi();
	
	kab.Corner();
	
}


}
