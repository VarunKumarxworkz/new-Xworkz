package com.xworkz.leo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.leo.config.LeoConfig;
import com.xworkz.leo.dto.LeoDto;
import com.xworkz.leo.serv.LeoServ;
import com.xworkz.leo.serv.LeoServImpl;

public class LeoRunner {

	public static void main(String[] args) {

		LeoDto dto = new LeoDto(1, "Vijay", "SanjayDutt", "Anirudh", 700, "Lokesh");

		LeoDto dto1 = new LeoDto(2, "Thalapathy", "Arjun", "Anirudh", 700, "Lokesh");
		LeoDto dto2 = new LeoDto(3, "Thalapathy", "Arjun", "Anirudh", 700, "Lokesh");
		LeoDto dto5 = new LeoDto(10, "Vijay", "Das", "Anirudh", 800, "Lokesh");
		ApplicationContext context = new AnnotationConfigApplicationContext(LeoConfig.class);

		LeoServ service = context.getBean(LeoServImpl.class);
		service.save(dto5);
//	LeoDto lio = service.findByHeroName("Vijay");
//	 System.out.println(lio);

	}

}
