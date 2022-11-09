package com.ty.onetoonebi_Ass.Controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi_Ass.DAO.AadharDAO;
import com.ty.onetoonebi_Ass.DAO.PersonDao;
import com.ty.onetoonebi_Ass.dto.AadharCard;
import com.ty.onetoonebi_Ass.dto.Person;



public class PersonMainclass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
//		AadharCard aadharCard = new AadharCard();
//		aadharCard.setAadharno(345432);
//		aadharCard.setAddress("tamilnadu");
//		aadharCard.setName("tom");
//		
//		
//		Person person = new Person();
//		person.setName("tom");
//		person.setEmail("tom@gmail.com");
//		person.setPhone(987654345);
//		
//		aadharCard.setPerson(person);
//		person.setAadharCard(aadharCard);
		
		PersonDao dao = new PersonDao();
		
	//	dao.savedata(person);
		
	//	System.out.println(dao.getdata(1));;
		
		AadharDAO dao2= new AadharDAO();
		
		System.out.println(dao2.getdata(1));

}}
