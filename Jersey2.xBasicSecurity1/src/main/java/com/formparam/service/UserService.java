package com.formparam.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.formparam.domain.User;
import com.formparam.exception.UserNotFoundException;

@Path("users")
public class UserService {
	@GET
	@Path("/getUser")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getUserService(@QueryParam("userId")String userId) throws UserNotFoundException {
	{
		User user=new User();
		try {
			if(userId!=null&& userId.equals("101")) {
				
			user.setUserId(userId);
			user.setUserName("sathish");
			user.setEmail("satish@gmail.com");
			user.setMobile("98963322");
		
			}
		
		}//try
		catch(Exception e){
			System.out.println("user id is not available");
			
		}
		System.out.println("UserDetails::"+user.getUserId()+""+user.getUserName()+""+user.getEmail()+""+user.getMobile());
		return Response.status(200).entity(user).type(MediaType.APPLICATION_JSON).build();
		}
	}
 
}
