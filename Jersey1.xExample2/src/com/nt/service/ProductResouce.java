package com.nt.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Product;

@Path("products")
public class ProductResouce {
	@GET
	@Path("/getProductInJson/{pid}/{pname}")
	@Produces(MediaType.APPLICATION_JSON)
public Product searchProduct1(@PathParam("pid") Integer pid ,@PathParam("pname") String pname) {
	
	Product p=null;
	if(pid!=null&& pid.equals(301)& pname!=null && pname.equals("keybord")) {
		p=new Product();
		p.setPid(pid);
		p.setPname("keybord");
		p.setPrice(600.3);
	}
	return p;
	}
	@GET
	@Path("getProductInXML/{pid}/{pname}")
	@Produces(MediaType.APPLICATION_XML)
public Product searchProduct2(@PathParam("pid")Integer pid,@PathParam("pname")String pname) {
	Product p=null;
	if(pid!=null&& pid.equals(302)& pname!=null && pname.equals("keybord")) {
		p=new Product();
		p.setPid(pid);
		p.setPname("keybord");
		p.setPrice(650.3);
		
		
	}
	return p;
}
	@GET
	@Path("/getProductInTEXT/{pid}/{pname}")
	@Produces(MediaType.TEXT_PLAIN)
public String searchProduct(@PathParam("pid")Integer pid,@PathParam("pname")String pname) {
	System.out.println("Enter into searchProduct2 text");
	Product p=null;
	if(pid!=null&& pid.equals(303)& pname!=null && pname.equals("keybord")) {
		p=new Product();
		p.setPid(pid);
		p.setPname("keybord");
		p.setPrice(600.3);
		return "keybord";
		
	}

		return "Poduct not found";
	
}
}
