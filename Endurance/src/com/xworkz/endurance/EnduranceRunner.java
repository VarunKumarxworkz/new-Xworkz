package com.xworkz.endurance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.endurance.config.EnduranceConfig;
import com.xworkz.endurance.dto.EnduranceDto;


public class EnduranceRunner {

	public static void main(String[] args) {
	 SessionFactory factory = EnduranceConfig.getSessionFactory();
	 Session session = factory.openSession();
	 EnduranceDto dto = new EnduranceDto("Satbility",1,"pre","Cardio",5);
	 Transaction transaction = session.beginTransaction();
	 session.save(dto);
	 transaction.commit();
	 session.close();
	}
}
