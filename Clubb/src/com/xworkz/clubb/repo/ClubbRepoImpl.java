package com.xworkz.clubb.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.clubb.config.ClubbConfig;
import com.xworkz.clubb.dto.ClubbDto;

public class ClubbRepoImpl implements ClubbRepo {
	 SessionFactory sessionFactory = ClubbConfig.getsessionFactory();
	public boolean save(ClubbDto dto) {
		
		 SessionFactory sessionFactory = ClubbConfig.getsessionFactory();
		 Session session = sessionFactory.openSession();
		 Transaction transaction =  session.beginTransaction();
		 session.save(dto);
		 transaction.commit();
		 session.close();
		
		
		return false;
		
	}
	@Override
	public ClubbDto read(int id) {
		Session session = sessionFactory.openSession();
		session.get(ClubbDto.class,1);
		return null;
	}
	@Override
	public ClubbDto updateByname(String name) {
		Session session = sessionFactory.openSession();
		session.get(ClubbDto.class,1);
		session.up
		return null;
	}
	
	
	


}
