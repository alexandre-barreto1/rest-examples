package com.rest.alexandre.service;

import java.util.List;

import com.rest.alexandre.domain.Buyer;
import com.rest.alexandre.domain.Item;

public interface ItemService {

	List<Item> getList();
	
	public void save(Item item);

}
