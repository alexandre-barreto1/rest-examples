package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.rest.model.Item;

public class RestClientItemIntegration {
	@Test
	public void rest(){
		String host = "http://localhost:8080";
			RestClient restClient = new RestClient(host);
		Item Item1 = new Item("nome1", "color1", 11);
		Item Item2 = new Item("nome2", "color2", 22);
		Item Item3 = new Item("nome3", "color3", 33);
		Item Item4 = new Item("nome4", "color4", 44);
		Item Item5 = new Item("nome5", "color5", 55);
		
		restClient.addItem(Item1);
		restClient.addItem(Item2);
		restClient.addItem(Item3);
		restClient.addItem(Item4);
		restClient.addItem(Item5);
		
		
		Item[] itemList = restClient.listItem();
		
		for (Item item : itemList) {
			System.out.println(" Item :" + item.toString());
		}
		
		assertEquals("Numero de employees esperados não esta correta", 5,
				itemList.length);

		assertEquals("Nome do primeiro employee nao é o esperado", "nome1",
				itemList[0].getName());
		
		restClient.delItem(itemList[0]);
	}

}
