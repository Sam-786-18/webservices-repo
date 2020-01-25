package com.formparam.service;


import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;



@Path("/customers")
public class CustomerResource {
  
   @GET
   @Path("{id}")
   @Produces("application/xml")
   public String getCustomer(@PathParam("id") int id,@Context SecurityContext sc) {
	return "id found";
	}

 

   
}