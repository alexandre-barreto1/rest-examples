package com.example.rest.model;

public class Todos {
	
	private Integer userId;
	private Integer id;
	private String title;
	private Boolean complete;
	
	public Todos(Integer userId,Integer id , String title,Boolean complete) {
		this.complete=complete;
		this.id=id;
		this.title=title;
		this.userId=userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

}
