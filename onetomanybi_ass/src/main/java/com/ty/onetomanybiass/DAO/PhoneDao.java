package com.ty.onetomanybiass.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybiass.DTO.Phone;
import com.ty.onetomanybiass.DTO.Sim;

public class PhoneDao {
	
	public void savedata(Phone phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(phone);
		List<Sim> sims=phone.getSims();
		for(Sim sim2:sims) {
			entityManager.persist(sim2);
		}
		entityTransaction.commit();	
	}
	
	public Phone getdata(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Phone phone=entityManager.find(Phone.class, id);
		
		return phone;
	}

}
