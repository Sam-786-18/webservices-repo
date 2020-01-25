package com.formparam.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.formparam.domain.Employee;

@Path("employee")
public class EmployeeService {
	@GET
	@Path("/getEmployeeByDeptNo")
	@Produces(MediaType.TEXT_PLAIN)
 public String getEmployee(@QueryParam("deptNo")int deptNo) {
		
	
	return "Employee Name=Raja,EmpNo=101,salary=3999,deptNo="+deptNo;
		
	
 }
	@GET
	@Path("/getEmployeeByDeptName/{deptName}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getEmployee(@PathParam("deptName")Employee emp) {
		return "Employee Name=Raja,EmpNo=101,salary=4000,deptName="+emp.getDeptName();
	}
	
	@GET
	@Path("/deleteDepartment")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteDepartment(@QueryParam("deptNo")List<Integer>deptNoList) {
		System.out.println("List of Departs:"+deptNoList);
		return "Departments Deleted";
		
	}
}