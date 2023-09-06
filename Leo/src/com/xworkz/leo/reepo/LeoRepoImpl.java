package com.xworkz.leo.reepo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.leo.dto.LeoDto;
@Component
public class LeoRepoImpl implements LeoRepo {
    @Autowired
	private EntityManagerFactory emf;
	@Override
	public boolean save(LeoDto dto) {
		if(emf!=null) {
	EntityManager em = emf.createEntityManager();	
	EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		return true;
	}
		System.out.println("emf is Not Null");
		return false;
	}
	@Override
	public List<LeoDto> findByHeroName(String heroName) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<LeoDto> query = em.createNamedQuery("findByName",LeoDto.class);
		query.setParameter("hn",heroName);
		List<LeoDto> dto = query.getResultList();
		if(!dto.isEmpty()) {
			System.out.println("dto is not empty");
			return dto;
		}
		else {
		System.out.println("dto is empty");
		return null;
	}
	}

}
