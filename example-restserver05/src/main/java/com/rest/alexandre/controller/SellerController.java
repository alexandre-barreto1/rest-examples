package com.rest.alexandre.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.alexandre.domain.Seller;
import com.rest.alexandre.service.SellerService;


@RestController
public class SellerController {

	private SellerService sellerService ;
	@Inject
	public SellerController(SellerService sellerService) {
		this.sellerService=sellerService;
	}
	
	@RequestMapping (value = "/seller/add",method=RequestMethod.POST)
	public void add(@RequestBody Seller seller){
		sellerService.save(seller);
	}
	
	@RequestMapping(value = "/seller/list",method = RequestMethod.GET)
		public List<Seller>sellerList (){
		List<Seller>sellerList = sellerService.getList();
			return sellerList;
		}
	@RequestMapping (value = "/seller/del",method = RequestMethod.DELETE)
	public void del(){
		
		System.out.println("SELLER DELETADO");
	}
	
	
}
