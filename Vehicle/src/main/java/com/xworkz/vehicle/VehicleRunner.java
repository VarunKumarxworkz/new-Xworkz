package com.xworkz.vehicle;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleSerImpl;
import com.xworkz.vehicle.service.VehicleServ;

public class VehicleRunner {
	public static void main(String[] args) {
		VehicleServ service = new VehicleSerImpl();
	    VehicleDto dto = new VehicleDto(1,"KTM","Bike","Petrol",200,2016);
		VehicleDto dto1 = new VehicleDto(2,"NINJAH2R","Bike","Nitro",400,2010);
		VehicleDto dto2 = new VehicleDto(3,"Aulto","Car","Disel",800,2005);
		System.out.println("----------saved-------------");
//	service.save(dto);
//	service.save(dto1);
//	service.save(dto2);
		System.out.println("--------finding-------");
//		VehicleDto vec =service.findByName("Aulto");
//		System.out.println(vec);
//  VehicleDto vech = service.findByConsumeAndPower("Disel", 800);
//  System.out.println(vech);
		System.out.println("-------updating----------");
//		service.updateTypeByName("SportsBike","NINJAH2R");
//		service.updateLaunchedInAndPowerById(2000,1000, 3);
		System.out.println("------deleting-------------");
    	service.deleteBylaunchedIn(2000);
//		System.out.println("---------Reading-------");
//		List<VehicleDto> list =service.readAll();
//		for (VehicleDto vandi : list) {
//			System.out.println(vandi);
			
//		}
	}

}
