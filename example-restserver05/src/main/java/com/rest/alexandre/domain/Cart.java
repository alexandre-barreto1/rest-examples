package com.rest.alexandre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
public class Cart {

	@Id
		@NotNull
		@Size(max=64)
		@Column(name = "id" , nullable = false,updatable = false)
		private String id;
	
		private Integer items ;
		
		private String date;
	
	Cart(){}
	public Cart(String id , Integer items , String date) {
		this.date=date;
		this.id=id;
		this.items = items;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Integer getItems() {
		return items;
	}


	public void setItems(Integer items) {
		this.items = items;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString(){
		return Objects.toStringHelper(this)
				.add("id",id)
				.add("items",items)
				.add("date",date)
				.toString();
	}

}
