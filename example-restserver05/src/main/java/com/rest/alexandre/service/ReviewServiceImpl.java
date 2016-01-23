package com.rest.alexandre.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.alexandre.domain.Review;
import com.rest.alexandre.repository.ReviewRepository;
@Service
public class ReviewServiceImpl implements ReviewService {

	private ReviewRepository repository;
	private final  Logger LOGGER = LoggerFactory.getLogger(ReviewServiceImpl.class);
	
	@Inject
	public ReviewServiceImpl(ReviewRepository repository) {
		this.repository=repository;
	}

	@Transactional
	public void save(Review review) {
		LOGGER.debug("Create{}", review);
		repository.save(review);
	}

	@Transactional(readOnly = true)
	public List<Review> getList() {
		LOGGER.debug("LIST");
		return repository.findAll();
	}
	
}
