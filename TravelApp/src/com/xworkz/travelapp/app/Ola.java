package com.xworkz.travelapp.app;

import org.springframework.stereotype.Component;

@Component("Ola")
public class Ola implements TravelAppInterface1 {

	@Override
	public void Rating() {
		System.out.println("Ola 5 rating");
		
	}

	@Override
	public void Price() {
		System.out.println("Ola Price 60Rs");
		
	}

}
