package com.javabasic.javalearn01.model;

public enum RestEndpointEnum {

	LIST_POSTS("/posts","100",""), 
	LIST_ALBUM("/albums","500",""), 
	ADD_POSTS("/posts","200",""), 
	ADD_ALBUM("/albums","300",""),
	ADD_COMMENT("/comments","300",""),
	LIST_COMMENT("/comments","300","");
	


	private String endpoint;
	private String limitItem;
	private String extra;

	private RestEndpointEnum(String endpoint,String limitItem,String extra) {
		this.setExtra(extra);
		this.setLimitItem(limitItem);
		this.setEndpoint(endpoint);

	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getLimitItem() {
		return limitItem;
	}

	public void setLimitItem(String limitItem) {
		this.limitItem = limitItem;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
}
