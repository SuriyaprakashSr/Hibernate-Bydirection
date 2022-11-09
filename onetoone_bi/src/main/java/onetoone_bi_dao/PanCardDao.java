package onetoone_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_bi_dto.PanCard;
import onetoone_bi_dto.Person;

public class PanCardDao
{

	public void savePanCard(PanCard card) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Person person = card.getPerson();
		PanCard card2 = new PanCard();


		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(card);
		entityTransaction.commit();


	}
	
	public PanCard getPanDetail(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		PanCard card = entityManager.find(PanCard.class, id);
		return card;
	}

}
