package com.xworkz.buss.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.buss.dto.BussDto;

public class BussConfig {
	
	public static SessionFactory sessionFactory;
	public static  SessionFactory getsessionFactory() {
		
		Configuration config = new Configuration();
		Properties prop = new Properties();
		
		prop.put(Environment.URL,"jdbc:mysql://localhost:3306/xworkz");
		prop.put(Environment.USER,"root");
		prop.put(Environment.PASS,"Xworkzodc@123");
		prop.put(Environment.SHOW_SQL,"true");
//		prop.put(Environment.HBM2DDL_AUTO,"create");
		prop.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5InnoDBDialect");
		
		config.setProperties(prop);
		config.addAnnotatedClass(BussDto.class);
		
		ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		 sessionFactory = config.buildSessionFactory(service);	
		
		return sessionFactory;	
	}

}
