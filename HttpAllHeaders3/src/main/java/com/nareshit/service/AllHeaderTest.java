package com.nareshit.service;

import java.util.List;
import java.util.Set;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;


@Path("/users")

public class AllHeaderTest{
@Path("/getAll")
@GET
@Produces("text/plain")
public Response getAllHeaders(@Context HttpHeaders headers) {
	MultivaluedMap<String, String> map=headers.getRequestHeaders();
	Set<String> keys=map.keySet();
	for(String key:keys) {
		System.out.println("Header Name:"+key);
		List<String> headerValues=headers.getRequestHeader(key);
		for(String headerValue:headerValues) {
			System.out.println(headerValue);
		}
	}
	return Response.status(200).build();
}

}
