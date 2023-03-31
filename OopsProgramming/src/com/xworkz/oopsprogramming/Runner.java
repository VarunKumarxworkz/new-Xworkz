package com.xworkz.oopsprogramming;

public class Runner {

	
public static void main (String[] args) {
	
	MenPhysique Gym = new MenPhysique(1200,4000);
	
	System.out.println(Gym.CreatineRate);
	System.out.println(Gym.ProtienCost);
	
	Gym.doWorkout();
	Gym.FollowDiet();
	Gym.RestMust();
	
	Gym.UseCreatine();
	Gym.UseProtien();
	
	BodyBulding Ronnie = new BodyBulding(1800,"MB");
	
	System.out.println(Ronnie.BCAAWorth);
	System.out.println(Ronnie.Brand);
	
	Ronnie.BCAAuser();
	Ronnie.PopularBrand();
	
	ClassicPhysique CBUM = new ClassicPhysique(15000,4);
	
	System.out.println(CBUM.ParticipationFee);
	System.out.println(CBUM.NoOfHost);
	
	CBUM.Participater();
	CBUM.Commenter();
		
	
			
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
