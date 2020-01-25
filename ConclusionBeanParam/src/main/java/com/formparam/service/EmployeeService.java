package com.formparam.service;


import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.formparam.domain.EmployeeBean;



@Path("employee")
public class EmployeeService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/searchEmployees")
 public String getEmployees(@BeanParam EmployeeBean employeeBean) {
	
	return "Employee Detials: empName=Raja,EmpNo=101,eSalary="+employeeBean.getSalary();
	
 }
	
}