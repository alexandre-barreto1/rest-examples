package com.example.rest.model;

public class Posts {

	private Integer userId;
	private Integer id;
	private String title;
	private String body;

	Posts() {
	}

	public Posts(Integer userId, Integer id, String title, String body) {
		this.body = body;
		this.id = id;
		this.title = title;
		this.userId = userId;

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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
