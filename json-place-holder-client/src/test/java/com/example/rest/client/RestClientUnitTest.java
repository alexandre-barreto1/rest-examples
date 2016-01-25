package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestClientUnitTest {
	@Test
	public void testUnit () throws Exception{
		
		RestClient client = new RestClient("http://jsonplaceholder.typicode.com/");
		
		String endpointPosts = client.endpointPosts();
		String endpointTodos = client.endpointTodos();
		String endpointPhotos = client.endpointPhotos();
		String endpointComments = client.endpointComments();
		String endpointAlbums = client.endpointAlbums();
		
		String erro = "Valor diferente do esperado";
		String uriEsperada ="http://jsonplaceholder.typicode.com/"+"/"+"/posts";
		String uriEsperada1 ="http://jsonplaceholder.typicode.com/"+"/"+"/todos";
		String uriEsperada2 ="http://jsonplaceholder.typicode.com/"+"/"+"/photos";
		String uriEsperada3 ="http://jsonplaceholder.typicode.com/"+"/"+"/Comments";
		String uriEsperada4 ="http://jsonplaceholder.typicode.com/"+"/"+"/Todos";
		
		
		assertEquals(erro,uriEsperada,endpointPosts);
		assertEquals(erro,uriEsperada3,endpointComments);
		
	}

}
