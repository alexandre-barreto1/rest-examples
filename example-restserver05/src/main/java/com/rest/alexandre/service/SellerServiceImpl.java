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

import com.rest.alexandre.domain.Seller;
import com.rest.alexandre.repository.SellerRepository;



@Service
@Validated 
public class SellerServiceImpl implements SellerService {
	
	private Logger  LOGGER = LoggerFactory.getLogger( SellerServiceImpl.class );
	
	private SellerRepository repository;
	
	@Inject
	public SellerServiceImpl(SellerRepository repository) {
		this.repository=repository;
	}
	
	@Transactional	
	public void save(@NotNull @Valid Seller seller) {
		LOGGER.debug("Create", seller);
		repository.save(seller);
	}

	@Transactional(readOnly = true)
	public List<Seller> getList() {
		LOGGER.debug("LIST");
		
		return repository.findAll();
	}

	

}
