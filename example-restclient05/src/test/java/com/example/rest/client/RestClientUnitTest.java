package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestClientUnitTest {


	@Test
	public void testListEmployeeUrl() throws Exception {

		RestClient clientBuyer = new RestClient("http://localhost:8080");
		RestClient clientItem = new RestClient("http://localhost:8080");
		RestClient clientSeller = new RestClient("http://localhost:8080");
		RestClient clientSupplier = new RestClient("http://localhost:8080");
		
		String endpointListBuyer = clientBuyer.endpointListBuyer();
		String endpointListItem= clientItem.endpointListItem();
		String endpointListSeller = clientSeller.endpointListSeller();
		String endpointListSupplier = clientSupplier.endpointListSupplier();
		
		String messageDeErro = "O valor do endpoint list employee é diferente do esperado";
		// TODO ENTENDER MELHOR ESSE TESTE E O PORQUE DESSA BARRA NAO FUNCIONAR COMO EU ESPERAVA
		String valorEsperadoBuyer = "http://localhost:8080" + "/" + "/buyer/list";
		String valorEsperadoItem = "http://localhost:8080" + "/" + "/item/list";
		String valorEsperadoSeller = "http://localhost:8080" + "/" + "/setler/list";
		String valorEsperadoSupplier = "http://localhost:8080" + "/" + "/supplier/list";
		
		assertEquals(messageDeErro, valorEsperadoSupplier, endpointListSupplier);
		
		assertEquals(messageDeErro, valorEsperadoSeller, endpointListSeller);

		assertEquals(messageDeErro, valorEsperadoItem, endpointListItem);

		assertEquals(messageDeErro, valorEsperadoBuyer, endpointListBuyer);

	}
}
