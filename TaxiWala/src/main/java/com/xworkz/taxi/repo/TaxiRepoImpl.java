package com.xworkz.taxi.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;
@Component
public class TaxiRepoImpl implements TaxiRepo {

	@Autowired
	private EntityManagerFactory emf;
	
	@Override
	public boolean saveTaxi(TaxiDto dto) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		return true;
	}

	

	@Override
	public boolean updateTaxiByEarning(int TaxiNo, int Earning) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
	Query query = em.createNamedQuery("updateTaxiByEarning").setParameter("tx",TaxiNo).setParameter("er",Earning);
		query.executeUpdate();
	    transaction.commit();
		return true;
	}

	@Override
	public boolean updateTaxiAvailableAndNoOftripsById(boolean isAvailable, int NoOfTrips, int Id) {
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Query query = em.createNamedQuery("updateTaxiAvailableAndNoOftripsById");
			query.setParameter("al",isAvailable);
			query.setParameter("tp",NoOfTrips);
			query.setParameter("cd", Id);
			query.executeUpdate();
			transaction.commit();
		return true;
	}

	@Override
	public List<TaxiDto> ReadAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("ReadAll");
		List<TaxiDto> dto = query.getResultList();
		return dto;
	}



	@Override
	public List<TaxiDto> findTaxiByLocation(String Location) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("findTaxiByLocation",TaxiDto.class);
		query.setParameter("loc", Location);
		List<TaxiDto> dto = query.getResultList();
		return dto;
	}

	

}
