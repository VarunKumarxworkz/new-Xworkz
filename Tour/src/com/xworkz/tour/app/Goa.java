package com.xworkz.tour.app;

import org.springframework.stereotype.Component;

@Component
public class Goa implements TourInterface {

	@Override
	public void Vehicle() {
		System.out.println("  Goa Bike");
		
	}

	@Override
	public void Package() {
		System.out.println("  Goa pack 8000");
		
	}

}
