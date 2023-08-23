package com.xworkz.tour.app;

import org.springframework.stereotype.Component;

@Component
public class Pondichery implements TourInterface {

	@Override
	public void Vehicle() {
		System.out.println("Pondichery Bike");
		
	}

	@Override
	public void Package() {
		System.out.println("Pondichery pack 7000");
		
	}

}
