package com.rest.alexandre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
public class Seller {

	@Id
	@NotNull
	@Size(max = 64)
	@Column(name = "id", nullable = false, updatable = false)
	private String id;

	private String name;

	private String address;

	Seller() {
	}

	public Seller(String id,String name, String address) {
		this.id = id;
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

	public String toString() {
		return Objects.toStringHelper(this).add("name", name)
				.add("address", address).toString();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
