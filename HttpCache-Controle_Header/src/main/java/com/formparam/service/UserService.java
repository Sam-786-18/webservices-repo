package com.formparam.service;



import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.formparam.domain.User;


@Path("users")
public class UserService {
	@POST
	@Path("getUser/{uid}")
	@Produces(MediaType.APPLICATION_XML)
 public Response getUserXMLwithCacheControl(@PathParam("uid")Long uid) {
		
	User user=null;
	if(uid.equals(101)) {
		user=new User();
		user.setUserId(uid);
		user.setUserName("sathish");
		user.setEmail("satish@gmail.com");
	}
	ResponseBuilder builder=Response.ok(user, MediaType.APPLICATION_XML);
//set the Max-age cache control directive.
	
	CacheControl cc=new CacheControl();
	cc.setMaxAge(300);
	cc.setPrivate(true);
	builder.cacheControl(cc);
	return builder.build();
	}
}