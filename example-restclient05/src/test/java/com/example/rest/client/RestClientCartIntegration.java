package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.rest.model.Buyer;
import com.example.rest.model.Cart;


public class RestClientCartIntegration {
	@Test
	public void rest(){
		String host = "http://localhost:8080";
			RestClient restClient = new RestClient(host);
		Cart cart1 = new Cart("nome1",  11, "endereco1");
		Cart cart2 = new Cart("nome2",  22, "endereco2");
		Cart cart3 = new Cart("nome3",  33, "endereco3");
		Cart cart4 = new Cart("nome4",  44, "endereco4");
		Cart cart5 = new Cart("nome5",  55, "endereco5");
		
		restClient.addCart(cart1);
		restClient.addCart(cart2);
		restClient.addCart(cart3);
		restClient.addCart(cart4);
		restClient.addCart(cart5);
		
		
		
		Cart[] cartList = restClient.listCart();
		
		for (Cart cart : cartList) {
			System.out.println(" Cart :" + cart.toString());
		}
		
		assertEquals("Numero de employees esperados não esta correta", 5,
				cartList.length);

		assertEquals("Nome do primeiro employee nao é o esperado", "nome1",
				cartList[0].getId());
		
		
		restClient.delCart(cartList[0]);
	}

}
