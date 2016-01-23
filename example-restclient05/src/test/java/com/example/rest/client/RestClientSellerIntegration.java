package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.rest.model.Seller;




public class RestClientSellerIntegration {
	@Test
	public void rest(){
		String host = "http://localhost:8080";
			RestClient restClient = new RestClient(host);
		Seller seller1 = new Seller("id1","nome11", "endereco11");
		Seller seller2 = new Seller("id2","nome22", "endereco22");
		Seller seller3 = new Seller("id3","nome33", "endereco33");
		Seller seller4 = new Seller("id4","nome44", "endereco44");
		Seller seller5 = new Seller("id5","nome55", "endereco55");
		
		restClient.addSeller(seller1);
		restClient.addSeller(seller2);
		restClient.addSeller(seller3);
		restClient.addSeller(seller4);
		restClient.addSeller(seller5);
		
		
		
		Seller[] sellerList = restClient.listSeller();
		
		for (Seller seller : sellerList) {
			System.out.println(" Seller :" + seller.toString());
		}
		
		assertEquals("Numero de seller esperados não esta correta", 5,
				sellerList.length);

		assertEquals("Nome do primeiro employee nao é o esperado", "nome11",
				sellerList[0].getName());
		
		restClient.delSeller(sellerList[0]);
	}

}
