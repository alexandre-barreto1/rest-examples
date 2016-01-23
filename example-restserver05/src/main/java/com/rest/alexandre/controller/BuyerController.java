package com.rest.alexandre.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.alexandre.domain.Buyer;
import com.rest.alexandre.service.BuyerService;


@RestController
public class BuyerController {

	private BuyerService bluyerService ;
	@Inject
	public BuyerController(BuyerService bluyerService) {
		this.bluyerService=bluyerService;
	}
	
	@RequestMapping (value = "/buyer/add",method=RequestMethod.POST)
	public void add(@RequestBody Buyer buyer){
		bluyerService.save(buyer);
	}
	
	@RequestMapping(value = "/buyer/list",method = RequestMethod.GET)
		public List<Buyer>buyerList (){
		List<Buyer>buyerList = bluyerService.getList();
			return buyerList;
		}
	@RequestMapping (value = "/buyer/del",method = RequestMethod.DELETE)
	public void del(){
		System.out.println("DELETADO");
	}
	
	
}
