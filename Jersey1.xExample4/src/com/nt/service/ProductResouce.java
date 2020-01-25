package com.nt.service;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Product;

@Path("products")
public class ProductResouce {
	@POST
	@Path("getProductInJson")
	@Produces(MediaType.APPLICATION_JSON)
public Product searchProduct1(@QueryParam("pid") Integer pid ,@QueryParam("pname") String pname) {
	
	Product p=null;
	if(pid!=null&& pid.equals(301)& pname!=null && pname.equals("keybord")) {
		p=new Product();
		p.setPid(101);
		p.setPname("mouse");
		p.setPrice(600.3);
	}
	return p;
	}
	@GET
	@Path("getProductInXML/{pid}/{pname}")
	@Produces(MediaType.APPLICATION_XML)
public Product searchProduct2(@PathParam("pid")Integer pid,@PathParam("pname")String pname) {
	System.out.println("Enter into searchProduct1 xml");
	Product p=null;
	if(pid!=null&& pid.equals(302)& pname!=null && pname.equals("keybord")) {
		p=new Product();
		p.setPid(101);
		p.setPname("mouse");
		p.setPrice(650.3);
		
		
	}
	return p;
}
	@GET
	@Path("/getProductInTEXT")
	@Produces(MediaType.TEXT_PLAIN)
public String searchProduct(@MatrixParam("pid")Integer pid,@MatrixParam("pname")String pname) {
	System.out.println("Enter into searchProduct2 text");
	Product p=null;
	if(pid!=null&& pid.equals(303)& pname!=null && pname.equals("keybord")) {
		p=new Product();
		p.setPid(101);
		p.setPname("mouse");
		p.setPrice(600.3);
		return "mouse";
		
	}

	return "not found";
	
}
}
