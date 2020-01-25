package com.nareshit.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nareshit.domain.Product;

@Path("products")
public class ProductResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("searchProduct")
public Product getProduct1(@QueryParam("pid")Integer pid,@QueryParam("pname")String pname)
{
	if(pid!=null && pid.equals(101)& pname!=null && pname.equals(pname)) {
		Product p=new Product();
		p.setPid(101);
		p.setPname("mouse");
		p.setPrice(600.3);
		return p;
	}
	else {
		return null;
	}
	
}
}


