package com.nareshit.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;


@Path("/users")

public class ContextParamTest{
@Path("/get")
@GET
@Produces("text/plain")
 public String  getHeader(@Context HttpHeaders headers) {
	String userAgent=headers.getRequestHeader("user-agent").get(0);
	System.out.println("ContextParam:"+userAgent);
	return "getHeader is called,userAgent:"+userAgent;
}
}
