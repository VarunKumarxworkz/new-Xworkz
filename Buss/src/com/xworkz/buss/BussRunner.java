package com.xworkz.buss;

import com.xworkz.buss.dto.BussDto;
import com.xworkz.buss.service.BussService;
import com.xworkz.buss.service.BussServiceImpl;

public class BussRunner {
   public static void main(String[] args) {
	
	   BussDto dto = new BussDto(1,"BMTC","Banasankari",10,50,80);
	   BussDto dto1 = new BussDto(2,"BMTC","jaynagar",15,55,80);
	   BussService service = new BussServiceImpl();
	   
// boolean Save = service.save(dto);
//   boolean Save1 = service.save(dto1);
//	   System.out.println(Save);
//	   service.findBylocation("'Banasankari'");
//	   service.updatenameBylocation("ksrtc", "'Banasankari'");
//	   service.findByname("'ksrtc'");
//	   service.updatenoOfseatsByname("'ksrtc'",85);
//	   service.deleteByname("'ksrtc'"); 
}
}
