package com.xworkz.karnataka.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.xworkz.karnataka.dto.KarnatakaDto;

@ComponentScan("com.xworkz.karnataka")
public class KarnatakaConfig {
    @Bean
	public List<KarnatakaDto> getList(){
		return new ArrayList<KarnatakaDto>();
	}
	
}
