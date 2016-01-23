package com.rest.alexandre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;

@Entity
public class Review {

	@Id
	@NotNull
	@Size(max = 64)
	@Column(name = "id", nullable = false, updatable = false)
	private String id;

	private String name;
	private String feedback;
	private String rate;

	Review() {
	}

	public Review(String id, String name, String feedback, String rate) {
		this.feedback = feedback;
		this.id = id;
		this.name = name;
		this.rate = rate;
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

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("id", id).add("name", name)
				.add("feedback", feedback).add("rate", rate).toString();
	}

}
