package com.rest.alexandre.domain;

import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
public class Buyer {

	@Id
	// @NotNull
	@Size(max = 64)
	@Column(name = "name", nullable = false, updatable = false)
	private String name;

	// @NotNull
	// @Size(max=64)
	// @Column(name = "address",nullable = false)
	private String address;

	// @NotNull
	// @Size(max=64)
	// @Column(name = "age",nullable = false)
	private Integer age;

	// @NotNull
	// @Size(max=64)
	// @Column(name = "items",nullable = false)
	private Integer items;

	Buyer() {
	}

	@Inject
	public Buyer(String name, String address, Integer age, Integer items) {
		this.address = address;
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

	public String toString() {
		return Objects.toStringHelper(this).add("name", name)
				.add("address", address).add("age", age).add("items", items)
				.toString();

	}

}
