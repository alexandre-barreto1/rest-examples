package com.rest.alexandre.service;

import java.util.List;

import com.rest.alexandre.domain.Buyer;

public interface BuyerService {

	List<Buyer> getList();
	
	public void save(Buyer buyer);

}
