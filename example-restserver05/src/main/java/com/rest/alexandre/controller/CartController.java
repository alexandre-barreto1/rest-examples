package com.rest.alexandre.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;







import com.rest.alexandre.domain.Cart;
import com.rest.alexandre.service.CartService;


@RestController
public class CartController {
	
public CartService cartService;
	@Inject
	public CartController(CartService cartService) {
		this.cartService=cartService;
	}
	
	@RequestMapping(value = "/cart/add",method = RequestMethod.POST)
	public void add(@RequestBody Cart cart){
		cartService.save(cart);
	}
	
	@RequestMapping(value = "/cart/list",method = RequestMethod.GET)
	public List <Cart> cartList (){
		List <Cart> cartList = cartService.getList();
		return cartList;
	}
	
	@RequestMapping(value = "/cart/del",method = RequestMethod.DELETE)
	public void del(){
		
		System.out.println("DELETADO");
		
	}
	
	
	
	
	

}
