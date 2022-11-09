package com.ty.onetomanybiass.Controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.onetomanybiass.DAO.PhoneDao;
import com.ty.onetomanybiass.DTO.Phone;
import com.ty.onetomanybiass.DTO.Sim;



public class PhoneController {
	public static void main(String[] args) {
//		Sim sim1 = new Sim();
//		sim1.setCompany("airtel");
//		sim1.setSimNumber(12345654);
//		sim1.setSimState("karnataka");
//		
//		Sim sim2 = new Sim();
//		sim2.setCompany("jio");
//		sim2.setSimNumber(987653);
//		sim2.setSimState("tamilNadu");
//		
//		
//		List<Sim> sims = new ArrayList<Sim>();
//		sims.add(sim2);
//		sims.add(sim1);
//		
//		Phone phone = new Phone();
//		phone.setColor("black");
//		phone.setCompany("vivo");
//        phone.setModelNumber(353526);
//        phone.setSims(sims);
//        
//        
//        sim1.setPhone(phone);
//        sim2.setPhone(phone);
//        
//        PhoneDao dao = new PhoneDao();
//        dao.savedata(phone);
        
		PhoneDao dao = new PhoneDao();
		System.out.println(dao.getdata(1));
        

	}

}
