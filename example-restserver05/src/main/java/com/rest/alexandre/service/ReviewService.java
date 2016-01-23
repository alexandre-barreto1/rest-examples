package com.rest.alexandre.service;

import java.util.List;

import com.rest.alexandre.domain.Review;

public interface ReviewService {

	public void save(Review review);
	
	List<Review> getList();

}
