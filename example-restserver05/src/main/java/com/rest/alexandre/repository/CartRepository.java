package com.rest.alexandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.alexandre.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, String> {


}
