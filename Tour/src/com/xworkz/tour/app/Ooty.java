package com.xworkz.tour.app;

import org.springframework.stereotype.Component;

@Component
public class Ooty implements TourInterface {

	@Override
	public void Vehicle() {
		System.out.println(" Ooty Car");
		
	}

	@Override
	public void Package() {
		System.out.println("ooty Package 5000");
		
	}

}
