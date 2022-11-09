package onetoone_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_bi_dto.PanCard;
import onetoone_bi_dto.Person;

public class PersonDao {
	
	public void saveData(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		PanCard card = person.getCard();
		
		entityTransaction.begin();
		entityManager.persist(card);
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public Person  getDetail(int id) {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person =entityManager.find(Person.class, id);
		return person;
	}

}
