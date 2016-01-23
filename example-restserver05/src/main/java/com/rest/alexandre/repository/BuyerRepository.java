package com.rest.alexandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.alexandre.domain.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, String>{

	

}
