package com.xworkz.taxi;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taxi.config.TaxiConfig;
import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.serv.TaxiServ;
import com.xworkz.taxi.serv.TaxiServImpl;

public class TaxiRunner {

	public static void main(String[] args) {
		TaxiDto dto = new TaxiDto(1,576,5000,true,"UttarHalli",5);
		TaxiDto dto1 = new TaxiDto(2,577,6000,true,"Kengeri",8);
		TaxiDto dto2 = new TaxiDto(3,578,7000,true,"SriNagar",3);
		TaxiDto dto3 = new TaxiDto(4,579,8000,true,"Konunkunta",2);
		TaxiDto dto4 = new TaxiDto(5,589,3000,true,"Kengeri",4);
		ApplicationContext context = new AnnotationConfigApplicationContext(TaxiConfig.class);
		TaxiServ service = context.getBean(TaxiServImpl.class);
//		service.saveTaxi(dto4);
//	   TaxiDto taxi = service.findTaxiByLocation("Konunkunta");
//		System.out.println(taxi);
//		service.updateTaxiByEarning(567, 7000);
//		service.updateTaxiAvailableAndNoOftripsById(false, 6, 2);
//		List<TaxiDto> list = service.ReadAll();
//		for (TaxiDto taxi : list) {
//			System.out.println(taxi);
		
		List<TaxiDto> lissta = (List<TaxiDto>) service.findTaxiByLocation("Kengeri");
		for (TaxiDto taxiwala : lissta) {
			System.out.println(taxiwala);
		}
		
		}
		
		
		
	}
	

