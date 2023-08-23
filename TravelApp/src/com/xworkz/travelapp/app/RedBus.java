package com.xworkz.travelapp.app;

import org.springframework.stereotype.Component;

@Component("RedBus")
public class RedBus implements TravelAppInterface2 {

	@Override
	public void comfort() {
	System.out.println("good Comfort");
		
	}

}
