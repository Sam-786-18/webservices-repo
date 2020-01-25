package com.nareshit.service;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Response;
@Path("/users")
public class CookieParamTest{
@GET
@Produces("text/plain")
 public Response getCookie(@CookieParam("name")Cookie cookie) {
	System.out.println(cookie);
	return Response.ok().build();
}
}

