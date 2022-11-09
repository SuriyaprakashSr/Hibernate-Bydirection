package com.ty.onetoonebi_Ass.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi_Ass.dto.AadharCard;
import com.ty.onetoonebi_Ass.dto.Person;

public class AadharDAO {

	
	public AadharCard getdata(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		AadharCard aadharCard = entityManager.find(AadharCard.class, id);
		
		return aadharCard;

	}
}
