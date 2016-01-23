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


import com.rest.alexandre.domain.Supplier;
import com.rest.alexandre.repository.SupplierRepository;


@Service
@Validated 
public class SupplierServiceImpl implements SupplierService {
	
	private Logger  LOGGER = LoggerFactory.getLogger( SupplierServiceImpl.class );
	
	private SupplierRepository repository;
	
	@Inject
	public SupplierServiceImpl(SupplierRepository repository) {
		this.repository=repository;
	}
	
	@Transactional	
	public void save(@NotNull @Valid Supplier supplier) {
		LOGGER.debug("Create", supplier);
		repository.save(supplier);
	}

	@Transactional(readOnly = true)
	public List<Supplier> getList() {
		LOGGER.debug("LIST");
		
		return repository.findAll();
	}

	
	}

	


