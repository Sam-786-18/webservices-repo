package com.nt.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Product")
public class ProductService {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("getProduct")
public Product searchProduct() {

		Product p=new Product();
		p.setProdId(101);
		p.setProdName("sattish");
		p.setProdPrice("500");
		return p;
	
	
}
}
