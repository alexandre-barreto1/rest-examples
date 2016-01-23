package com.example.rest.model;

public class Supplier {

	private String name ;
	private	String address;
	private Integer price;
	
	
	Supplier(){}
	public Supplier(String name,String address,Integer price) {
		this.address=address;
		this.price = price;
		this.name = name;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}


}
