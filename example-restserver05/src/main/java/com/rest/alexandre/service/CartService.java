package com.rest.alexandre.service;

import java.util.List;

import com.rest.alexandre.domain.Cart;

public interface CartService {

	List<Cart>getList();
	
	public void save(Cart cart);

}
