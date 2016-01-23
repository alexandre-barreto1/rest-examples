package com.example.rest.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.rest.model.Buyer;
import com.example.rest.model.Supplier;


public class RestClientSupplierIntegration {
	@Test
	public void rest(){
		String host = "http://localhost:8080";
			RestClient restClient = new RestClient(host);
		Supplier supplier1 = new Supplier("nome1", "endereco1", 11);
		Supplier supplier2 = new Supplier("nome2", "endereco2", 22);
		Supplier supplier3 = new Supplier("nome3", "endereco3", 33);
		Supplier supplier4 = new Supplier("nome4", "endereco4", 44);
		Supplier supplier5 = new Supplier("nome5", "endereco5", 55);
		
		restClient.addSupplier(supplier1);
		restClient.addSupplier(supplier2);
		restClient.addSupplier(supplier3);
		restClient.addSupplier(supplier4);
		restClient.addSupplier(supplier5);
		
		
		
		Supplier[] supplierList = restClient.listSupplier();
		
		for (Supplier supplier : supplierList) {
			System.out.println(" Supplier :" + supplier.toString());
		}
		
		assertEquals("Numero de employees esperados não esta correta", 5,
				supplierList.length);

		assertEquals("Nome do primeiro employee nao é o esperado", "nome1",
				supplierList[0].getName());
		
		restClient.delSupplier(supplierList[0]);
	}

}
