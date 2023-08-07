package com.xworkz.vikram.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.vikram.dto.VikramDto;

public class VikramRepoImpl implements VikramRepo {
	EntityManagerFactory  emf = Persistence.createEntityManagerFactory("databaseProperties");
	
	EntityManager em = emf.createEntityManager();
	@Override
	public boolean save(VikramDto dto) {
	
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		em.close();
		return false;
	}
	@Override
	public VikramDto findByHero(String hero) {
		String query = "from VikramDto where hero= " + hero;
		TypedQuery<VikramDto> query2= em.createQuery(query, VikramDto.class);
		return query2.getSingleResult(); 
	}
	@Override
	public boolean updateBudgetById(int id,int Budget) {
	EntityTransaction transaction= em.getTransaction();
	transaction.begin();
	Query query = em.createNamedQuery("update");
	query.setParameter("bd",Budget);
	query.setParameter("id", id);
	query.executeUpdate();
     transaction.commit();
     em.close();
	
		return false;
	}
	@Override
	public boolean deleteById(int id) {
		EntityTransaction transaction= em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("delete");
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
		em.close();
		return false;
	}
	@Override
	public List<VikramDto> readAll() {
		Query query = em.createNamedQuery("readAll");
		return query.getResultList();
	}
	
	

	
	
	
	
	
}
