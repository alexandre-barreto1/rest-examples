package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.rest.model.Buyer;


public class RestClientBuyerIntegration {
	@Test
	public void rest(){
		String host = "http://localhost:8080";
			RestClient restClient = new RestClient(host);
		Buyer buyer1 = new Buyer("nome1", "endereco1", 11, 1);
		Buyer buyer2 = new Buyer("nome2", "endereco2", 22, 2);
		Buyer buyer3 = new Buyer("nome3", "endereco3", 33, 3);
		Buyer buyer4 = new Buyer("nome4", "endereco4", 44, 4);
		Buyer buyer5 = new Buyer("nome5", "endereco5", 55, 5);
		
		restClient.addBuyer(buyer1);
		restClient.addBuyer(buyer2);
		restClient.addBuyer(buyer3);
		restClient.addBuyer(buyer4);
		restClient.addBuyer(buyer5);
		
		
		
		Buyer[] buyerList = restClient.listBuyer();
		
		for (Buyer buyer : buyerList) {
			System.out.println(" Buyer :" + buyer.toString());
		}
		
		assertEquals("Numero de employees esperados não esta correta", 5,
				buyerList.length);

		assertEquals("Nome do primeiro employee nao é o esperado", "nome1",
				buyerList[0].getName());
		
		restClient.delBuyer(buyerList[0]);
	}

}
