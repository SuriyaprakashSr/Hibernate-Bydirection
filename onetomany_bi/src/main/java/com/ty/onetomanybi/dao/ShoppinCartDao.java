package com.ty.onetomanybi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybi.dto.Item;
import com.ty.onetomanybi.dto.ShoppingCart;

public class ShoppinCartDao {

	public void saveData(ShoppingCart cart ) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		entityTransaction.begin();
		List<Item> item = cart.getItems();
		for(Item item2:item) {
			entityManager.persist(item2);
		}
		
		
		entityManager.persist(cart);
		entityTransaction.commit();
	}
	  
	public ShoppingCart getData(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		ShoppingCart cart=entityManager.find(ShoppingCart.class, id);
		
		return cart;
		
	}

}
