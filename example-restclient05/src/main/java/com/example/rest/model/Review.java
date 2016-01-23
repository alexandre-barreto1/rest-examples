package com.example.rest.model;

public class Review {
	private String id ;
	private String name ;
	private String feedback;
	private String rate;

	Review(){}
	
	public Review(String id,String name , String feedback,String rate) {
		this.feedback = feedback;
		this.setId(id);
		this.name=name;
		this.rate=rate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feddback) {
		this.feedback = feddback;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

}
