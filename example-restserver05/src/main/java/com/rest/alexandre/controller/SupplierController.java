package com.rest.alexandre.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.alexandre.domain.Supplier;
import com.rest.alexandre.service.SupplierService;

@RestController
public class SupplierController {

	private SupplierService supplierService ;
	@Inject
	public SupplierController(SupplierService supplierService) {
		this.supplierService=supplierService;
	}
	
	@RequestMapping (value = "/supplier/add",method=RequestMethod.POST)
	public void add(@RequestBody Supplier supplier){
		supplierService.save(supplier);
	}
	
	@RequestMapping(value = "/supplier/list",method = RequestMethod.GET)
		public List<Supplier>buyerList (){
		List<Supplier>buyerList = supplierService.getList();
			return buyerList;
		}
	@RequestMapping (value = "/supplier/del",method = RequestMethod.DELETE)
	public void del(@RequestBody Supplier supplier){
		System.out.println("DELETADO");

	}
	
	
}
