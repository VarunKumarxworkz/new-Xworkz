package com.xworkz.karnataka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.karnataka.config.KarnatakaConfig;
import com.xworkz.karnataka.dto.KarnatakaDto;
import com.xworkz.karnataka.service.KarnatakaServ;
import com.xworkz.karnataka.service.KarnatakaServImpl;

public class KarnatakaRunner {
	
	public static void main(String[] args) {
		KarnatakaDto dto = new KarnatakaDto(1,"Banglore","Kannada","Elephant","Muddhe",750);
		ApplicationContext context = new AnnotationConfigApplicationContext(KarnatakaConfig.class);
		KarnatakaServ service = context.getBean(KarnatakaServ.class);
		
		service.save(dto);
	}

}
 