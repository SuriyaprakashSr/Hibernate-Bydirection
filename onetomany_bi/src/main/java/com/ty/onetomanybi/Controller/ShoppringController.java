package com.ty.onetomanybi.Controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.onetomanybi.dao.ShoppinCartDao;
import com.ty.onetomanybi.dto.Item;
import com.ty.onetomanybi.dto.ShoppingCart;

public class ShoppringController {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.setId(1);
		cart.setName("suriya");
		cart.setEmail("suriya@gmail.com");
		cart.setAddress("blr");
		
		Item i1 = new Item();
		i1.setId(101);
		i1.setName("pen");
		i1.setPrice(20);
		i1.setManufacturer("camlin");
		i1.setCart(cart);
		
		Item i2 = new Item();
		i2.setId(105);
		i2.setName("laptom");
		i2.setPrice(5000);
		i2.setManufacturer("hp");
		i2.setCart(cart);
		
		List<Item> items = new ArrayList<Item>();
		
		items.add(i1);
		items.add(i2);
		
		cart.setItems(items);
		
		ShoppinCartDao cartDao  = new ShoppinCartDao();
		cartDao.saveData(cart);
		//System.out.println(cartDao.getData(1));
		
		
		
		
		
		
		
	}

}
