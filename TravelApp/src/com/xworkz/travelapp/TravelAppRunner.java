package com.xworkz.travelapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.travelapp.app.TravelAppService;
import com.xworkz.travelapp.config.TravelAppConfig;

public class TravelAppRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TravelAppConfig.class);
		TravelAppService service = context.getBean(TravelAppService.class);
		
		service.booking();
		
		service.seats();
	}
	
}
