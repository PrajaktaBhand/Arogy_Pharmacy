package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OrderItem")
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_id;
	private int oid;
	private int quantity;
	
	@Column(name = "pid", insertable = false, updatable = false)
	private int pid;
	
	@OneToOne
	@JoinColumn(name = "item_id", referencedColumnName = "pid")
	private Product product;
	
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "OrderItem [item_id=" + item_id + ", oid=" + oid + ", quantity=" + quantity + ", pid=" + pid
				+ ", product=" + product + "]";
}
	
	

	public OrderItem(int item_id, int oid, int quantity, int pid, Product product) {
		super();
		this.item_id = item_id;
		this.oid = oid;
		this.quantity = quantity;
		this.pid = pid;
		this.product = product;
	}

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
