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

import com.rest.alexandre.domain.Buyer;
import com.rest.alexandre.repository.BuyerRepository;

@Service
//@Validated 
public class BuyerServiceImpl implements BuyerService {
	
	private Logger  LOGGER = LoggerFactory.getLogger( BuyerServiceImpl.class );
	
	private BuyerRepository repository;
	
	@Inject
	public BuyerServiceImpl(BuyerRepository repository) {
		this.repository=repository;
	}
	
	@Transactional	//@NotNull //@Valid
	public void save(  					Buyer buyer) {
		LOGGER.debug("Create", buyer);
		repository.save(buyer);
	}

	@Transactional(readOnly = true)
	public List<Buyer> getList() {
		LOGGER.debug("LIST");
		
		return repository.findAll();
	}

	

}
