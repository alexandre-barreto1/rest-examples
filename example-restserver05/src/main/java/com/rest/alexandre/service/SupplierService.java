package com.rest.alexandre.service;

import java.util.List;


import com.rest.alexandre.domain.Supplier;

public interface SupplierService {

	List<Supplier> getList();
	
	public void save(Supplier supplier);

}
