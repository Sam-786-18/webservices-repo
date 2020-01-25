package com.resteasy.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
@GET
@Path("/sayHello/{name}")
@Produces(MediaType.TEXT_PLAIN)
public String sayHello(@PathParam("name") String name) {
	return "Hello " + name + " Welcome to RestEasy";
	
}
}
