package com.example.rest.client;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.rest.model.Albums;
import com.example.rest.model.Posts;

public class RestClient {

	private static final String ALBUMS = "/albums";
	private static final String POSTS = "/post";

	private String host;
	private RestTemplate restTemplate;

	public RestClient(String host) {
		this.setHost(host);
		setRestTemplate(new RestTemplate());

	}

	public String endpointAlbums() {
		String url = getHost() + "/" + ALBUMS;
		return url;
	}

	public String endpointPosts() {
		String url = getHost() + "/" + POSTS;
		return url;
	}

	// ////////////////POSTS/////////////////////

	public Posts[] listPosts() {
		String url = endpointPosts();

		ResponseEntity<Posts[]> responseEntity = getRestTemplate()
				.getForEntity(url, Posts[].class);

		Posts[] posts = responseEntity.getBody();
		return posts;

	}

	public Posts addPost(Posts posts) {

		ResponseEntity<Posts> postForEntity = getRestTemplate().postForEntity(
				endpointPosts(), posts, Posts.class);

		Posts body = postForEntity.getBody();

		return body;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public static String getAlbums() {
		return ALBUMS;
	}

	public static String getPosts() {
		return POSTS;
	}

	public Albums[] listAlbums() {
		ResponseEntity<Albums[]> responseEntity = getRestTemplate()
				.getForEntity(endpointAlbums(), Albums[].class);
		Albums[] body = responseEntity.getBody();
		return body;
	}

	public Albums addAlbums(Albums albums) {
		ResponseEntity<Albums> postForEntity = getRestTemplate().postForEntity(
				endpointAlbums(), albums, Albums.class);

		return postForEntity.getBody();
	}

}
