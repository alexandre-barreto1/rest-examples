package com.example.rest.client;

import java.util.Iterator;

import org.junit.Test;

import com.example.rest.model.Posts;

public class RestClientPostsIntegrationTest {

	@Test
	public void url() {

		RestClient restClient = new RestClient(
				"http://jsonplaceholder.typicode.com/");

		Posts[] listPosts = restClient.listPosts();
		for (Posts posts : listPosts) {
			System.out.println(posts.getId());
		}

	}

}
