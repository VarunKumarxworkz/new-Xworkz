package com.xworkz.travelapp.app;

import org.springframework.stereotype.Component;

@Component("Uber")
public class Uber implements TravelAppInterface2 {

	@Override
	public void comfort() {
		System.out.println("Uber not Comfort");
		
	}

}
