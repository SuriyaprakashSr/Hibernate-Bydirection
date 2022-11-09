package onetoone_bi_Controller;

import onetoone_bi_dao.PanCardDao;
import onetoone_bi_dto.PanCard;

public class PanCardMain {
	public static void main(String[] args) {
		
		
		PanCardDao cardDao = new PanCardDao();
		PanCard cardDao2= cardDao.getPanDetail(1);
		
		System.out.println(cardDao2);
	}

}
