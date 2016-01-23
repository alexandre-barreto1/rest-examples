package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.rest.model.Buyer;
import com.example.rest.model.Review;

public class RestClientReviewIntegration {
	@Test
	public void rest(){
		String host = "http://localhost:8080";
			RestClient restClient = new RestClient(host);
		Review review1 = new Review("1", "endereco1", "feedback1", "rate1");
		Review review2 = new Review("2", "endereco2", "feedback2", "rate2");
		Review review3 = new Review("3", "endereco3", "feedback3", "rate3");
		Review review4 = new Review("4", "endereco4", "feedback4", "rate4");
		Review review5 = new Review("5", "endereco5", "feedback4", "rate4");
		
		restClient.addReview(review1);
		restClient.addReview(review2);
		restClient.addReview(review3);
		restClient.addReview(review4);
		restClient.addReview(review5);
		
		
		Review[] reviewList = restClient.listReview();
		
		for (Review review : reviewList) {
			System.out.println(" review :" + review.toString());
		}
		
		assertEquals("Numero de employees esperados não esta correta", 5,
				reviewList.length);

		assertEquals("Nome do primeiro employee nao é o esperado", "1",
				reviewList[0].getId());
		
		restClient.delReview(reviewList[0]);
	}

}
