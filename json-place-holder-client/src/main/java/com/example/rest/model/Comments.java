package com.example.rest.model;

public class Comments {
	private Integer postId ;
	private Integer Id;
	private String name;
	private String email;
	
	public Comments(Integer postId,Integer Id,String name,String email) {
		this.email=email;
		this.Id=Id;
		this.name=name;
		this.postId=postId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
