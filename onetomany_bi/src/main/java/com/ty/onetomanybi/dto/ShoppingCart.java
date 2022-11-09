package com.ty.onetomanybi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ShoppingCart {
	@Id
	private int id;
	private String name;
	private String address;
	private String email;
	@OneToMany(mappedBy = "cart")
	private List<Item> items ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", items="
				+ items + "]";
	}
	
	
	
	
	
	
	

}
