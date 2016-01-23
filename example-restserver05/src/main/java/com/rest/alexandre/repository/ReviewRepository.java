package com.rest.alexandre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.alexandre.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, String>{

	

}
