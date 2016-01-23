package com.rest.alexandre.service;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.rest.alexandre.domain.Item;
import com.rest.alexandre.repository.ItemRepository;



@Service
//@Validated 
public class ItemServiceImpl implements ItemService {
	
	private Logger  LOGGER = LoggerFactory.getLogger( ItemServiceImpl.class );
	
	private ItemRepository repository;
	
	@Inject
	public ItemServiceImpl(ItemRepository repository) {
		this.repository=repository;
	}
	
	@Transactional	//@NotNull //@Valid
	public void save(  					Item item) {
		LOGGER.debug("Create", item);
		repository.save(item);
	}

	@Transactional(readOnly = true)
	public List<Item> getList() {
		LOGGER.debug("LIST");
		
		return repository.findAll();
	}

	

}
