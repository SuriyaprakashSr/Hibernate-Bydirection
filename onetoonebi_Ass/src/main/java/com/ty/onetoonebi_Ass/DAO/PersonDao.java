package com.ty.onetoonebi_Ass.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi_Ass.dto.AadharCard;
import com.ty.onetoonebi_Ass.dto.Person;

public class PersonDao {

	public void savedata(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		AadharCard aadharCard = person.getAadharCard();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadharCard);
		entityTransaction.commit();

	}

	public Person getdata(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, id);
		
		return person;

	}

}
