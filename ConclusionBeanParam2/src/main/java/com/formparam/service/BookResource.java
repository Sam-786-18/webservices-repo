package com.formparam.service;


import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.formparam.domain.BookDTO;




@Path("book")
public class BookResource{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("registrationBook/{isbn}")
 public Response  getBook(@BeanParam BookDTO book ) {
	
	System.out.println("Isbn:"+book.getIsbn());
	 return Response.ok("ok").status(200).build();
	
 }
	
}