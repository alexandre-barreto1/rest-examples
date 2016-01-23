package com.rest.alexandre.service;

import java.util.List;

import com.rest.alexandre.domain.Seller;



public interface SellerService {

	List<Seller> getList();
	
	public void save(Seller seller);

}
