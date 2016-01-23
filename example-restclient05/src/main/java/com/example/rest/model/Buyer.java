package com.example.rest.model;

public class Buyer {

	private String name ;
	private	String address;
	private Integer age;
	private Integer items;
	
	Buyer(){}
	public Buyer(String name,String address,Integer age,Integer items) {
		this.address=address;
		this.age = age;
		this.items = items;
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


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getItems() {
		return items;
	}


	public void setItems(Integer items) {
		this.items = items;
	}

}
