package com.xworkz.tour.app;

import org.springframework.stereotype.Component;

@Component
public class KodaiKanal implements TourInterface {

	@Override
	public void Vehicle() {
		System.out.println("  KodaiKanal Car");
		
	}

	@Override
	public void Package() {
		System.out.println("  KodaiKanal Pack 6000");
		
	}

}
