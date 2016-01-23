package com.example.rest.model;

public class Item {

	private String name ;
	private String color;
	private	Integer qtd;
	
	Item(){}
	public Item(String name,String color,Integer qtd) {
		this.qtd=qtd;
		this.color =color;
		this.name = name;
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
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}



}
