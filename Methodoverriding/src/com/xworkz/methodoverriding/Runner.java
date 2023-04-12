package com.xworkz.methodoverriding;

 

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles vehicles = new Vehicles();
		// call  Consume() method from Vehicles
		vehicles.Consume();
		// call Travel() method from Vehicles
		vehicles.Travel();
		// call Ride()  method from Vehicles
		vehicles.Ride();
		
		Car car= new Car();
		// call  Consume() method from Car
				car.Consume();
				// call Travel() method from Car
				car.Travel();
				// call Ride()  method from Car
				car.Ride();
	
		 Bike  bike = new Bike();
			   // call  Consume() method from Bike
		bike.Consume();
			// call Travel() method from Bike
		bike.Travel();
			// call Ride()  method from Bike
		bike.Ride();	
		
		 Aircraft plane =new Aircraft();
			// call  Consume() method from  Aircraft
			plane.Consume();
			// call Travel() method from  Aircraft
			plane.Travel();
			// call Ride()  method from Aircraft
			plane.Ride();
			
			Bus bus= new Bus();
			// call  Consume() method from bus
			bus.Consume();
			// call Travel() method from bus
			bus.Travel();
			// call Ride()  method from bus
			bus.Ride();
			
			Cycle bicycle = new Cycle();
			 
			// call  Consume() method from Cycle
			bicycle.Consume();
			// call Travel() method from Cycle
			bicycle.Travel();
			// call Ride()  method from Cycle
			bicycle.Ride();
		

	}

}
