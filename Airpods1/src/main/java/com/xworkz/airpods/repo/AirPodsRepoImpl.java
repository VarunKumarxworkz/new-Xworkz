package com.xworkz.airpods.repo;

import java.util.List;

import com.xworkz.airpods.dto.AirpodsDto;

public class AirPodsRepoImpl {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("data_connection");
	EntityManager em = emf.createEntityManager();
	
	
	
	public boolean store(AirpodsDto dto) {

			em.getTransaction().begin();
			em.persist(dto);
			em.close();
			return true;
	}



	public boolean updateColorByName(String color, String name) {
			em.getTransaction().begin();
		Query query = em.createNamedQuery("updateColorbyName");
		
		query.setParameter("color", color);
		query.setParameter("name", name);
		query.executeUpdate();
		return true;
		
	}



	public boolean deleteByPrice(int price) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPrice");
			query.setParameter("pr", price);
			em.getTransaction().commit();
			return true;
		
	}



	public List<AirpodsDto> readAll() {
		Query query = em.createNamedQuery("readAll");
		List<AirpodsDto> dto =  query.getResultList();
		return dto;
	}
	

}
