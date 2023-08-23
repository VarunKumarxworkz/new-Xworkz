package com.xworkz.travelapp.app;

import org.springframework.stereotype.Component;

@Component("Rapido")
public class Rapido implements TravelAppInterface1 {

	@Override
	public void Rating() {
		System.out.println("Rapido 8 rating");
		
	}

	@Override
	public void Price() {
		System.out.println("Rapido 40 rs");
		
	}

}
