package com.rest.alexandre.domain;

import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
public class Supplier {

	@Id
	@NotNull
	@Size(max = 64)
	@Column(name = "name", nullable = false, updatable = false)
	private String name;

	@NotNull
	@Size(max = 64)
	@Column(name = "address", nullable = false)
	private String address;

	// @NotNull
	// @Size(max=64)
	@Column(name = "price", nullable = false)
	private Integer price;

	Supplier() {
	}

	@Inject
	public Supplier(String name, String address, Integer price) {
		this.address = address;
		this.name = name;
		this.price = price;
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

	public String toString() {
		return Objects.toStringHelper(this).add("name", name)
				.add("address", address).add("price", price).toString();

	}

}
