package com.xworkz.employee.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
@Component
public class EmployeeRepoImpl implements EmployeeRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean save(EmployeeDto dto) {
		if(emf!=null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			em.close();
		}
		
		return false;
	}

	@Override
	public EmployeeDto findByName(String name) {
		Query query = em.createNamedQuery("findByName").setParameter("nm",name);
		EmployeeDto dto = (EmployeeDto) query.getSingleResult();   
		return dto;
	}

	@Override
	public EmployeeDto findByNameAndAge(String name, int age) {
		Query query = em.createNamedQuery("findByNameAndAge").setParameter("nam", name).setParameter("ag",age);
		EmployeeDto dto = (EmployeeDto) query.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateAgeByFatherName(int Age, String Name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateAgeByFatherName").setParameter("aee",Age).setParameter("fn",Name);
		query.executeUpdate();
		transaction.commit();
		
		return true;
	}

	@Override
	public boolean updateAddressByGenderAndExperience(String Address, String Gender, int Experience) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateAddressByGenderAndExperience").setParameter("add", Address).setParameter("gn", Gender)
				.setParameter("exp",Experience);
		query.executeUpdate();
		transaction.commit();
		
		return true;
	}

	@Override
	public boolean DeleteByEmail(String Email) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("DeleteByEmail").setParameter("em", Email);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public List<EmployeeDto> ReadAll() {
		Query query = em.createNamedQuery("ReadAll");
		List<EmployeeDto> dto = query.getResultList();
		return dto;
	}

	@Override
	public boolean DeleteByQualificationAndMaritalStatus(String Qualification, String MaritalStatus) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("DeleteByQualificationAndMaritalStatus").setParameter("qa",Qualification).setParameter("ms",MaritalStatus);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	
	

}
