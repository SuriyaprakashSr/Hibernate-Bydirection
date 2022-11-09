package com.ty.onetomanybi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomanybi.dto.Item;


public class ItemsDeo {

	
	
	public Item getData(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		Item cart=entityManager.find(Item.class, id);
		
		return cart;
		
	}
	
}
