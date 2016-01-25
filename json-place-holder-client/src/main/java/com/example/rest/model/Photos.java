package com.example.rest.model;

public class Photos {

	private Integer albumId;
	private Integer id;
	private String title;
	private String url;
	private String body;

	public Photos(Integer albumId, Integer id, String title, String url,String body) {
		this.albumId = albumId;
		this.id = id;
		this.title = title;
		this.url = url;
		this.body= body;
	}

	public Integer getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
