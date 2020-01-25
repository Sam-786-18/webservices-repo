package com.formparam.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("employee")
public class EmployeeService {
	@GET
	@Path("/getEmployeeDetails")
 public Response getEmployee(@QueryParam("dept")String department,@QueryParam("location")String location) {
	
		String resp="Query Paramenters are received.'dept' value is:"+department+"and location is:"+location;
		System.out.println(resp);
		return Response.status(200).entity(resp).build();
 }
}
