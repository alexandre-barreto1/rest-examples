package com.rest.alexandre.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





import com.rest.alexandre.domain.Review;
import com.rest.alexandre.service.ReviewService;
@RestController
public class ReviewController {
	
	public ReviewService reviewService;
	@Inject
	public ReviewController(ReviewService reviewService) {
		this.reviewService=reviewService;
	}
	
	@RequestMapping(value = "/review/add",method=RequestMethod.POST)
	public void add(@RequestBody Review review){
		reviewService.save(review);
	}
	@RequestMapping(value = "/review/list",method=RequestMethod.GET)
	public List<Review> listReview(){
		List<Review> listReview = reviewService.getList();
		return listReview;
	}

	@RequestMapping(value = "/review/del",method=RequestMethod.DELETE)
	public void delete(){
		System.out.println("DELETADO");

	}
		
}
