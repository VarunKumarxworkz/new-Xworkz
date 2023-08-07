package com.xworkz.kgf.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.xworkz.kgf.dto.KGF2Dto;

public class KGF2RepImpl implements KGF2Repo {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
     EntityManager em = emf.createEntityManager();
	@Override
	public boolean save(KGF2Dto dto) {
		    
	EntityTransaction transaction = em.getTransaction();
	transaction.begin();
	em.persist(dto);
	transaction.commit();
	em.close();
		
		return false;
	}
	@Override
	public KGF2Dto findByHero(String hero) {
		String query = "from KGF2Dto where hero="+ hero;
		TypedQuery<KGF2Dto> dto = em.createQuery(query, KGF2Dto.class);
		
		return dto.getSingleResult();
	}
	@Override
	public KGF2Dto findById(int id) {
		KGF2Dto dto = em.find(KGF2Dto.class,id);
		return dto;
	}
	@Override
	public boolean updateBudgetById(int id, int Budget) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
