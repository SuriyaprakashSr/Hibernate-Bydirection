package onetoone_bi_Controller;

import onetoone_bi_dao.PersonDao;
import onetoone_bi_dto.PanCard;
import onetoone_bi_dto.Person;

public class PersonMainCLass {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("prakash");
		person.setAge(21);
		person.setGrnder("male");
		
		
		
		PanCard card = new PanCard();
		
		card.setName("prakash");
		card.setPanNumber("jhdgd23jj");
		
		
		person.setCard(card);
		card.setPerson(person);
		
		
	PersonDao dao1 = new PersonDao();
	dao1.saveData(person);
//		System.out.println(dao1.getDetail(1));
		
	}

}
