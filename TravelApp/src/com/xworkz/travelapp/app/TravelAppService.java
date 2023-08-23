package com.xworkz.travelapp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("Service")
public class TravelAppService {
    @Autowired
    @Qualifier("Rapido")
	private TravelAppInterface1 inter;
    
	public void booking() {
		System.out.println("StartsNow");
		inter.Price();
	}
	
	@Autowired
	@Qualifier("RedBus")
	private TravelAppInterface2 inter2; 
	
	public void seats() {
		System.out.println("Seats Are Available");
		inter2.comfort();
	}
}
