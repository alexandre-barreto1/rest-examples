package com.javabasic.javalearn01.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestEndpointEnumTest {

	// #TEST 1
	// Verificar cada constante no enum(RestEndpointEnum). Se o desenvolvedor
	// mudar os valores o teste precisa falhar. RestEndpointEnumTest.ADD_POSTS
	// LIST_POSTS("/posts","100","") -> Se um dos 3 valores da constante ao lado
	// mudar o teste precisa falhar.
	// #TEST 2
	// Se o desenvolvedor adicionar uma nova constate o teste precisa falhar. ->
	// RestEndpointEnumTest.values().length

	@Test
	public void testEnum01() {

		assertEquals("Erro no endpoint", "/posts",
				RestEndpointEnum.ADD_POSTS.getEndpoint());
		assertEquals("Erro no limitItem", "200",
				RestEndpointEnum.ADD_POSTS.getLimitItem());
		assertEquals("Erro no extra", "", RestEndpointEnum.ADD_POSTS.getExtra());

		assertEquals("Erro no endpoint", "/albums",
				RestEndpointEnum.ADD_ALBUM.getEndpoint());
		assertEquals("Erro no limitItem", "300",
				RestEndpointEnum.ADD_ALBUM.getLimitItem());
		assertEquals("Erro no extra", "", RestEndpointEnum.ADD_ALBUM.getExtra());

		assertEquals("Erro no endpoint", "/comments",
				RestEndpointEnum.ADD_COMMENT.getEndpoint());
		assertEquals("Erro no limitItem", "300",
				RestEndpointEnum.ADD_COMMENT.getLimitItem());
		assertEquals("Erro no extra", "",
				RestEndpointEnum.ADD_COMMENT.getExtra());

	}

	@Test
	public void testEnum02() {

		int valorEsperado = RestEndpointEnum.values().length;
		assertEquals("Erro no extra", 6, valorEsperado);

	}

}
