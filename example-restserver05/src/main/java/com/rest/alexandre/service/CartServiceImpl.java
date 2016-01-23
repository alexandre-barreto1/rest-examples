package com.rest.alexandre.service;

import java.util.List;

import javassist.util.proxy.FactoryHelper;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.alexandre.domain.Cart;
import com.rest.alexandre.repository.CartRepository;
@Service
public class CartServiceImpl implements CartService{
	
	private CartRepository repository;
	
	private  Logger LOGGER = LoggerFactory.getLogger(CartServiceImpl.class);
	
	@Inject
	public CartServiceImpl(CartRepository repository) {
		this.repository = repository;
	}

	@Transactional (readOnly = true)
	public List<Cart> getList() {
		LOGGER.debug("LIST");
		return repository.findAll();
	}

	@Transactional 
	public void save(Cart cart) {
		LOGGER.debug("Create{}", cart);
		repository.save(cart);
		
	}

}
