package com.xworkz.leo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.leo")
public class LeoConfig {

	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean emf = new LocalEntityManagerFactoryBean();
		emf.setPersistenceUnitName("databaseProperties");
		return emf;
	}
	
	
}
