package com.xworkz.clubb.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.clubb.dto.ClubbDto;

public class ClubbConfig {

	public static  SessionFactory sessionFactory;
	public  static SessionFactory  getsessionFactory() {
		
		Configuration config = new Configuration();
		Properties props = new Properties();
		props.put(Environment.URL,"jdbc:mysql://localhost:3306/xworkz");
		props.put(Environment.USER,"root");
		props.put(Environment.PASS,"Xworkzodc@123");
		props.put(Environment.SHOW_SQL,"true");
//		props.put(Environment.HBM2DDL_AUTO,"create");
		props.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5InnoDBDialect");
		
		config.setProperties(props);
		config.addAnnotatedClass(ClubbDto.class);
		ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		sessionFactory = config.buildSessionFactory(service);
		return sessionFactory;
		
		
	}

	
	
}
