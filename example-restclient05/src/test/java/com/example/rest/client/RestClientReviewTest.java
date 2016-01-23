package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestClientReviewTest {

	@Test
	public void testListEmployeeUrl() throws Exception {

		RestClient client = new RestClient("http://localhost:8080");

		String messageDeErro = "O valor do endpoint list employee é diferente do esperado";

		String valorEsperadoReviewList = "http://localhost:8080" + "/"
				+ "/review/list";

		assertEquals(messageDeErro, valorEsperadoReviewList,
				client.endpointListReview());

	}
}
