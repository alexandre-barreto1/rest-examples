package com.example.rest.client;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.rest.model.Albums;
import com.example.rest.model.Comments;
import com.example.rest.model.Photos;
import com.example.rest.model.Posts;
import com.example.rest.model.Todos;

public class RestClient {

	private static final String ALBUMS = "/albums";
	private static final String POSTS = "/posts";
	private static final String PHOTOS = "/photos";
	private static final String COMMENTS = "/comments";
	private static final String TODOS = "/todos";

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

	public String endpointPhotos() {
		String url = getHost() + "/" + PHOTOS;
		return url;
	}

	public String endpointComments() {
		String url = getHost() + "/" + COMMENTS;
		return url;
	}

	public String endpointTodos() {
		String url = getHost() + "/" + TODOS;
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

	// ////////////////////////ALBUMS//////////////////////////////////
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

	// ///////////////////////PHOTOS////////////////////////////////////

	public Photos[] listPhotos() {

		ResponseEntity<Photos[]> responseEntity = getRestTemplate()
				.getForEntity(endpointPhotos(), Photos[].class);

		return responseEntity.getBody();

	}

	public Photos addphotos(Photos photos) {

		ResponseEntity<Photos> entity = getRestTemplate().postForEntity(
				endpointPhotos(), photos, Photos.class);
		return entity.getBody();
	}

	// /////////////////////COMMENTS///////////////////////////////////////////
	public Comments[] listComments() {
		ResponseEntity<Comments[]> forEntity = getRestTemplate().getForEntity(
				endpointComments(), Comments[].class);
		return forEntity.getBody();
	}

	public Comments addComments(Comments comments) {
		ResponseEntity<Comments> forEntity = getRestTemplate().postForEntity(
				endpointPhotos(), comments, Comments.class);

		return forEntity.getBody();
	}

	// /////////////////////////TODOS//////////////////////////////////////////////

	public Todos[]  listTodos() {
		ResponseEntity<Todos[]> forEntity = getRestTemplate().getForEntity(
				endpointTodos(), Todos[].class);
		return forEntity.getBody();
	}

	public Todos addTodos(Todos todos) {
		ResponseEntity<Todos> postForEntity = getRestTemplate().postForEntity(
				endpointTodos(), todos, Todos.class);
		return postForEntity.getBody();
	}

	// ///////////////////////////////////////////////////////////////////////////
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

	public static String getPhotos() {
		return PHOTOS;
	}

	public static String getComments() {
		return COMMENTS;
	}

}
