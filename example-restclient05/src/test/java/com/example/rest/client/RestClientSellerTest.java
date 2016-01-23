package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestClientSellerTest {

	@Test
	public void test() throws Exception {

		RestClient client = new RestClient("http://localhost:8080");

		String messageDeErro = "O valor do endpoint list employee é diferente do esperado";

		String valorEsperadoSellerList = "http://localhost:8080" + "/"
				+ "/seller/list";

		assertEquals(messageDeErro, valorEsperadoSellerList,
				client.endpointListSeller());

	}
}
