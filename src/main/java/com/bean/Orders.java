package com.bean;



import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	@Column(name="order_date")
	private LocalDate order_date;
	@Column(name="delivery_date")
	private LocalDate delivery_date;
	private int cid;
	
	@OneToMany
	@JoinColumn(name="oid",referencedColumnName = "oid")
	private List<OrderItem> listOfOrderItem;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public LocalDate getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}

	public LocalDate getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(LocalDate delivery_date) {
		this.delivery_date = delivery_date;
	}


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public List<OrderItem> getListOfOrderItem() {
		return listOfOrderItem;
	}

	public void setListOfOrderItem(List<OrderItem> listOfOrderItem) {
		this.listOfOrderItem = listOfOrderItem;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", order_date=" + order_date + ", delivery_date=" + delivery_date + ", cid=" + cid
				+ ", listOfOrderItem=" + listOfOrderItem + "]";
	}


	public Orders(int oid, LocalDate order_date, LocalDate delivery_date, int cid, List<OrderItem> listOfOrderItem) {
		super();
		this.oid = oid;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
		this.cid = cid;
		this.listOfOrderItem = listOfOrderItem;
	}
	
}
