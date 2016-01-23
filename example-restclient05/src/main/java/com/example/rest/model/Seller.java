package com.example.rest.model;

public class Seller {

	private String id;
	private String name;
	private String address;

	Seller() {
	}

	public Seller(String id, String name, String address) {
		this.setId(id);
		this.address = address;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
