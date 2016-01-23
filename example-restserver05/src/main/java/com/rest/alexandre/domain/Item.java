package com.rest.alexandre.domain;

import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
public class Item {

	@Id
		@NotNull
		@Size(max=64)
		@Column(name = "name",nullable = false,updatable = false)
		private String name;
		
		@NotNull
		@Size(max=64)
		@Column(name = "color",nullable = false)
		private String color;
		
		//@NotNull
		//@Size(max=64)
		//@Column(name = "qtd",nullable = false)
		private Integer qtd;
		
		
		Item(){}
	
	public Item(String name , String color , Integer qtd) {
		this.color=color;
		this.qtd=qtd;
		
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	public String toString(){
		return Objects.toStringHelper(this)
				.add("name",name)
				.add("color",color)
				.add("qtd",qtd)
				.toString();

	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}	

}
