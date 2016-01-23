package com.rest.alexandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rest.alexandre.domain.Supplier;



public interface SupplierRepository extends JpaRepository<Supplier, String>{

	

}
