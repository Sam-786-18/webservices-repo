package com.nareshit.service;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")

public class HeaderParamTest{
@Path("/getHeader")
@GET
 public Response  getHeaderResult(@HeaderParam("user-agent") String userAgent) {
	System.out.println("getHeaderResult method is calling and userAgent is:"+userAgent);
	return Response.status(200).entity(userAgent).build();
}
}
