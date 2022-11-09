package com.ty.onetomanybiass.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Sim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String company;
    private long simNumber;
    private String simState;
    
    @ManyToOne
    @JoinColumn
    private Phone phone;
    
    
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
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
	public long getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(long simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimState() {
		return simState;
	}
	public void setSimState(String simState) {
		this.simState = simState;
	}
	@Override
	public String toString() {
		return "Sim [id=" + id + ", company=" + company + ", simNumber=" + simNumber + ", simState=" + simState + "]";
	}
    
    

}
