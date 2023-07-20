package com.traxcrm.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// Basically this @Entity will map to the database table 
@Table(name = "Billings")//Here table name is Leads
public class Billing {// class name is Lead

	@Id// creating number
	@GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement
	private long id;
	
	@Column(name = "first_name" , length=45 , nullable=false)
	private String firstName;
	
	@Column(name = "second_name" , length=40 , nullable=false)
	private String secondName;
	
	@Column(name = "email" , length=120 , nullable=false , unique=true)
	private String email;
	
	@Column(name = "mobile" ,length=10  ,nullable=false , unique=true)
	private long mobile;

	@Column(name="Product_name")
	private String productName;
	
	@Column(name="Amount")
    public int amount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
		

	
	
	
	
}
