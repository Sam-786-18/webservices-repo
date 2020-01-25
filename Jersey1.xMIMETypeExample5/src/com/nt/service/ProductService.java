package com.nt.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("products")
public class ProductService {
@POST
@Path("/registerProduct")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_XML)
	public String registerProduct(String product_XML) {
	System.out.println("In Server::");
	System.out.println(product_XML);
	return "Product Registeration Completed Successfully";
	}
	
}
