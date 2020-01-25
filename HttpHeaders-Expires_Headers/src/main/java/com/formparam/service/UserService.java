package com.formparam.service;



import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.formparam.domain.User;


@Path("users")
public class UserService {
	@GET
	@Path("getUser/{uid}")
	@Produces(MediaType.APPLICATION_XML)
 public Response searchUser(@PathParam("uid")Long uid) {
		
	User user=null;
	if(uid.equals(101)) {
		user=new User();
		user.setUserId(uid);
		user.setUserName("sathish");
		user.setEmail("satish@gmail.com");
	}
	ResponseBuilder builder=Response.ok(user, MediaType.APPLICATION_XML);
	//puting expire header for Http browser caching
	Calendar cal=Calendar.getInstance();
	cal.set(2017, 10, 7, 10, 0);
	builder.expires(cal.getTime());
	return builder.build();
	}
}