package com.example.rest.model;

public class Cart {
	
	private String date ;
	private Integer items;
	private String id;
	
	Cart(){}
	
	public Cart( String id, Integer items , String date) {
		this.date=date;
		this.setId(id);
		this.items=items;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Integer getItems() {
		return items;
	}


	public void setItems(Integer items) {
		this.items = items;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

}
