package com.formparam.domain;

import javax.ws.rs.QueryParam;

public class EmployeeBean {
@QueryParam("salary")
private double salary;
@QueryParam("deptName")
private String deptName;
@QueryParam("location")
private String location;


public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}


public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}


}
