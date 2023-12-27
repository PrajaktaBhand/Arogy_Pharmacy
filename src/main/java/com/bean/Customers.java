package com.bean;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String gender;
	private long contact;
	private String email;
	private String password;
	
	@OneToMany
	@JoinColumn(name="cid",referencedColumnName = "cid")
	private List<Orders> listOfOrder;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(int cid, String cname, String gender, long contact, String email, String password,
			List<Orders> listOfOrder) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.listOfOrder = listOfOrder;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Orders> getListOfOrder() {
		return listOfOrder;
	}

	public void setListOfOrder(List<Orders> listOfOrder) {
		this.listOfOrder = listOfOrder;
	}

	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", gender=" + gender + ", contact=" + contact + ", email="
				+ email + ", password=" + password + ", listOfOrder=" + listOfOrder + "]";
	}

}
