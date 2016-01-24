package com.example.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.rest.model.Buyer;
import com.example.rest.model.Cart;
import com.example.rest.model.Item;
import com.example.rest.model.Review;
import com.example.rest.model.Seller;
import com.example.rest.model.Supplier;

public class RestClient {

	private static final String ADD_BUYER = "/buyer/add";
	private static final String LIST_BUYER = "/buyer/list";
	private static final String DELETE_BUYER = "/buyer/del";

	private static final String ADD_SELLER = "/seller/add";
	private static final String LIST_SELLER = "/seller/list";
	private static final String DELETE_SELLER = "/seller/del";

	private static final String ADD_ITEM = "/item/add";
	private static final String LIST_ITEM = "/item/list";
	private static final String DELETE_ITEM = "/item/del";

	private static final String ADD_SUPPLIER = "/supplier/add";
	private static final String LIST_SUPPLIER = "/supplier/list";
	private static final String DELETE_SUPPLIER = "/supplier/del";

	private static final String ADD_CART = "/cart/add";
	private static final String LIST_CART = "/cart/list";
	private static final String DELETE_CART = "/cart/del";

	private static final String ADD_REVIEW = "/review/add";
	private static final String LIST_REVIEW = "/review/list";
	private static final String DELETE_REVIEW = "/review/del";

	private String host;
	private RestTemplate restTemplate;

	public RestClient(String host) {
		this.setHost(host);
		setRestTemplate(new RestTemplate());
	}

	// //////////////BUYER//////////////////////
	public String endpointListBuyer() {
		String url = getHost() + "/" + LIST_BUYER;
		return url;
	}

	public String endpointAddBuyer() {
		String url = getHost() + "/" + ADD_BUYER;
		return url;
	}

	public String endpointDelBuyer() {
		String url = getHost() + "/" + DELETE_BUYER;
		return url;
	}

	// ////////////////SELLER///////////////////
	public String endpointListSeller() {
		String url = getHost() + "/" + LIST_SELLER;
		return url;
	}

	public String endpointAddSeller() {
		String url = getHost() + "/" + ADD_SELLER;
		return url;
	}

	public String endpointDelSeller() {
		String url = getHost() + "/" + DELETE_SELLER;
		return url;
	}

	// ////////////////////ITEM////////////////////
	public String endpointListItem() {
		String url = getHost() + "/" + LIST_ITEM;
		return url;
	}

	public String endpointAddItem() {
		String url = getHost() + "/" + ADD_ITEM;
		return url;
	}

	public String endpointDelItem() {
		String url = getHost() + "/" + DELETE_ITEM;
		return url;
	}

	// ///////////////Supplier/////////////////////

	public String endpointListSupplier() {
		String url = getHost() + "/" + LIST_SUPPLIER;
		return url;
	}

	public String endpointAddSupplier() {
		String url = getHost() + "/" + ADD_SUPPLIER;
		return url;
	}

	public String endpointDelSupplier() {
		String url = getHost() + "/" + DELETE_SUPPLIER;
		return url;
	}

	// /////////////////CART//////////////////////////
	public String endpointListCart() {
		String url = getHost() + "/" + LIST_CART;
		return url;
	}

	public String endpointAddCart() {
		String url = getHost() + "/" + ADD_CART;
		return url;
	}

	public String endpointDelCart() {
		String url = getHost() + "/" + DELETE_CART;
		return url;
	}

	// ////////////////REVIEW/////////////////////////////

	public String endpointListReview() {
		String url = getHost() + "/" + LIST_REVIEW;
		return url;
	}

	public String endpointAddReview() {
		String url = getHost() + "/" + ADD_REVIEW;
		return url;
	}

	public String endpointDelReview() {
		String url = getHost() + "/" + DELETE_REVIEW;
		return url;
	}

	// /////////////////////////////////////////////////////

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

	public static String getAddBuyer() {
		return ADD_BUYER;
	}

	public static String getListBuyer() {
		return LIST_BUYER;
	}

	public static String getDeleteBuyer() {
		return DELETE_BUYER;
	}

	public static String getAddSeller() {
		return ADD_SELLER;
	}

	public static String getListSeller() {
		return LIST_SELLER;
	}

	public static String getDeleteSeller() {
		return DELETE_SELLER;
	}

	public static String getAddItem() {
		return ADD_ITEM;
	}

	public static String getListItem() {
		return LIST_ITEM;
	}

	public static String getDeleteItem() {
		return DELETE_ITEM;
	}

	public static String getAddSupplier() {
		return ADD_SUPPLIER;
	}

	public static String getListSupplier() {
		return LIST_SUPPLIER;
	}

	public static String getDeleteSupplier() {
		return DELETE_SUPPLIER;
	}

	public static String getAddCart() {
		return ADD_CART;
	}

	public static String getListCart() {
		return LIST_CART;
	}

	public static String getDeleteCart() {
		return DELETE_CART;
	}

	public static String getAddReview() {
		return ADD_REVIEW;
	}

	public static String getListReview() {
		return LIST_REVIEW;
	}

	public static String getDeleteReview() {
		return DELETE_REVIEW;
	}

	// /////////BUYER////////////////

	public Buyer[] listBuyer() {

		String url = endpointListBuyer();
		ResponseEntity<Buyer[]> responseEntity = getRestTemplate()
				.getForEntity(url, Buyer[].class);

		Buyer[] body = responseEntity.getBody();

		return body;
	}

	public Buyer addBuyer(Buyer buyer) {

		ResponseEntity<Buyer> created = getRestTemplate().postForEntity(
				endpointAddBuyer(), buyer, Buyer.class);
		Buyer body = created.getBody();
		return body;
	}

	public void delBuyer(Buyer buyer) {
		getRestTemplate().delete(endpointDelBuyer(), buyer);

	}

	// ///////////SELLER///////////////////

	public Seller[] listSeller() {

		String url = endpointListSeller();
		ResponseEntity<Seller[]> responseEntity = getRestTemplate()
				.getForEntity(url, Seller[].class);

		Seller[] body = responseEntity.getBody();

		return body;
	}

	public Seller addSeller(Seller seller) {

		ResponseEntity<Seller> postForEntity = getRestTemplate().postForEntity(
				endpointAddSeller(), seller, Seller.class);
		Seller body = postForEntity.getBody();
		return body;
	}

	public void delSeller(Seller seller) {
		getRestTemplate().delete(endpointDelSeller());

	}

	// /////////////////ITEM/////////////////////////////

	public Item[] listItem() {

		String url = endpointListItem();
		ResponseEntity<Item[]> responseEntity = getRestTemplate().getForEntity(
				url, Item[].class);

		Item[] body = responseEntity.getBody();

		return body;
	}

	public Item addItem(Item item) {

		ResponseEntity<Item> created = getRestTemplate().postForEntity(
				endpointAddItem(), item, Item.class);
		Item body = created.getBody();
		return body;
	}

	public void delItem(Item item) {
		getRestTemplate().delete(endpointDelItem(), item);

	}

	// /////////////////SUPPLIER//////////////////////////////////////
	public Supplier[] listSupplier() {

		String url = endpointListSupplier();
		ResponseEntity<Supplier[]> responseEntity = getRestTemplate()
				.getForEntity(url, Supplier[].class);

		Supplier[] body = responseEntity.getBody();

		return body;
	}

	public Supplier addSupplier(Supplier supplier) {

		ResponseEntity<Supplier> created = getRestTemplate().postForEntity(
				endpointAddSupplier(), supplier, Supplier.class);
		Supplier body = created.getBody();
		return body;
	}

	public Buyer delSupplier(Supplier supplier) {
		getRestTemplate().delete(endpointDelSupplier(), supplier);

		return null;
	}

	// ////////////////////////////CART/////////////////////////////////
	public Cart[] listCart() {

		String url = endpointListCart();
		ResponseEntity<Cart[]> responseEntity = getRestTemplate().getForEntity(
				url, Cart[].class);

		Cart[] body = responseEntity.getBody();

		return body;
	}

	public Cart addCart(Cart cart) {

		ResponseEntity<Cart> created = getRestTemplate().postForEntity(
				endpointAddCart(), cart, Cart.class);
		Cart body = created.getBody();
		return body;
	}

	public void delCart(Cart cart) {
		getRestTemplate().delete(endpointDelCart(), cart);

	}

	// //////////////////////REVIEW//////////////////////////////////////////
	public Review[] listReview() {

		String url = endpointListReview();
		ResponseEntity<Review[]> responseEntity = getRestTemplate()
				.getForEntity(url, Review[].class);

		Review[] body = responseEntity.getBody();

		return body;
	}

	public Review addReview(Review review) {

		ResponseEntity<Review> created = getRestTemplate().postForEntity(
				endpointAddReview(), review, Review.class);
		Review body = created.getBody();
		return body;
	}

	public Review delReview(Review review) {
		getRestTemplate().delete(endpointDelReview(), review);
		return null;
	}

}
