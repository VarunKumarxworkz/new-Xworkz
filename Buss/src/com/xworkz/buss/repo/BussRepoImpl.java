package com.xworkz.buss.repo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.buss.config.BussConfig;
import com.xworkz.buss.dto.BussDto;

public class BussRepoImpl implements BussRepo {
	
	SessionFactory sessionFactory = BussConfig.getsessionFactory();
	
	public boolean save(BussDto dto) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		
		return true;
	}


	public BussDto findBylocation(String location) {
		Session session = sessionFactory.openSession();
		String query = "From BussDto where location=" + location;
 	    Query<BussDto> dto = session.createQuery(query, BussDto.class);
	      BussDto dto1 = dto.getSingleResult();
		return dto1;
	}


	@Override
	public boolean updatenameBylocationAnd(String name ,String location) {
		BussDto bus = findBylocation(location);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		bus.setName(name);
		session.update(bus);
		transaction.commit();
		session.close();
		return false;
	}


	@Override
	public BussDto findByname(String name) {
	Session session = sessionFactory.openSession();
	String query = "From BussDto where name=" + name;
	Query<BussDto> buss = session.createQuery(query, BussDto.class);
	BussDto dto = buss.getSingleResult();
		return dto;
	}


	@Override
	public boolean updatenoOfseatsByname(String name, int noOfseats) {
		BussDto dtoo = findByname(name);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		dtoo.setNoOfseats(noOfseats);
		session.update(dtoo);
		transaction.commit();
		session.close();
		
		return false;
	}


	@Override
	public boolean deleteByname(String name) {
		BussDto dto = findByname(name);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(dto);
		transaction.commit();
		session.close();
		return false;
	}
	
	
	
	
	

}
