package com.formparam.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
public class UserService {
@POST
@Path("/registerUser")
@Produces(MediaType.TEXT_PLAIN)

public String registerUser(
@FormParam("name") 
String name,
@FormParam("age") int age) 
{
//communicate with DAO and User
//Details into db
	System.out.println("Name:"+name+"Age:"+age);
	String responseStatus="Your Registration Success";
return responseStatus;

}
}
