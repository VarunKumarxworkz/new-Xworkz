package com.xworkz.tour.app;

import org.springframework.stereotype.Component;

@Component
public class KannyaKumari implements TourInterface {

	@Override
	public void Vehicle() {
		System.out.println("KannyaKumari Bike");
		
	}

	@Override
	public void Package() {
		System.out.println("KannyaKumari pack 10000");
		
	}

}
