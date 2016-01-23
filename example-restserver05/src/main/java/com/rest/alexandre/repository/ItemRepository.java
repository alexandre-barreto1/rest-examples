package com.rest.alexandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.alexandre.domain.Item;

public interface ItemRepository extends JpaRepository<Item, String>{

	

}
