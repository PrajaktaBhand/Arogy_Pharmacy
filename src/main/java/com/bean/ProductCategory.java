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
@Table(name="ProductCategory")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pcid;
	private String type_of_product;
	
	@OneToMany
	@JoinColumn(name = "pcid", referencedColumnName = "pcid")
	private List<Product> ListOfProduct;
	
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCategory(int pcid, String type_of_product) {
		super();
		this.pcid = pcid;
		this.type_of_product = type_of_product;
	}
	public int getPcid() {
		return pcid;
	}
	public void setPcid(int pcid) {
		this.pcid = pcid;
	}
	public String getType_of_product() {
		return type_of_product;
	}
	public void setType_of_product(String type_of_product) {
		this.type_of_product = type_of_product;
	}

	public List<Product> getListOfProduct() {
		return ListOfProduct;
	}
	public void setListOfProduct(List<Product> listOfProduct) {
		ListOfProduct = listOfProduct;
	}
	public ProductCategory(int pcid, String type_of_product, List<Product> listOfProduct) {
		super();
		this.pcid = pcid;
		this.type_of_product = type_of_product;
		ListOfProduct = listOfProduct;
	}
	@Override
	public String toString() {
		return "ProductCategory [pcid=" + pcid + ", type_of_product=" + type_of_product + ", ListOfProduct="
				+ ListOfProduct + "]";
	}
	
	
}
