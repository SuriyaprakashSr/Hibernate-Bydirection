package com.ty.onetomanybiass.DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String company;
	private long  modelNumber;
	private String color ;
	@OneToMany(mappedBy = "phone")
	private List<Sim> sims;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public long getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(long modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<Sim> getSims() {
		return sims;
	}
	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", company=" + company + ", modelNumber=" + modelNumber + ", color=" + color
				+ ", sims=" + sims + "]";
	}
	
	
	
	
 
}
