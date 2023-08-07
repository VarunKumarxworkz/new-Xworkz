package com.xworkz.vehicle.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.vehicle.dto.VehicleDto;

public class VehicleRepoImpl implements VehicleRepo {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em =emf.createEntityManager();  
	@Override
	public boolean save(VehicleDto dto) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
//		em.close();
		return false;
	}
	@Override
	public VehicleDto findByName(String name) {
		Query query = em.createNamedQuery("findByName");
		query.setParameter("nm", name);
//		query.executeUpdate();
		return (VehicleDto) query.getSingleResult();
		
	}
	@Override
	public VehicleDto findByConsumeAndPower(String consume, int power) {
		Query query = em.createNamedQuery("findByConsumeAndPower");
		query.setParameter("con",consume);
		query.setParameter("pow", power);
//		query.executeUpdate();
		query.getSingleResult();
		return (VehicleDto) query.getSingleResult();
	}
	@Override
	public boolean updateTypeByName(String type, String name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateTypeByName");
		query.setParameter("ty",type);
		query.setParameter("nm",name);
		query.executeUpdate();
		transaction.commit();
		em.close();
		return false;
	}
	@Override
	public boolean updateLaunchedInAndPowerById(int launchedIn, int Power, int id) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateLaunchedInAndPowerByid");
		query.setParameter("ld",launchedIn);
		query.setParameter("pow",Power);
		query.setParameter("id",id);
		query.executeUpdate();
		transaction.commit();
		em.close();
		return false;
	}
	@Override
	public boolean deleteBylaunchedIn(int launchedIn) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("deleteBylaunchedIn");
		query.setParameter("lnd",launchedIn);
		query.executeUpdate();
		transaction.commit();
		em.close();
		return true;
	}
	@Override
	public List<VehicleDto> readAll() {
		Query query = em.createNamedQuery("readAll");
		 List<VehicleDto> dto = query.getResultList();
		return dto;
	}
	
	
}
