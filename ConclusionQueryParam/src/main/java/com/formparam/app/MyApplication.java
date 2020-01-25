package com.formparam.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.formparam.service.EmployeeService;


public class MyApplication extends Application {
private Set<Object> set=new HashSet<Object>();
public MyApplication() {
	set.add(new EmployeeService());
}
@Override
	public Set<Object> getSingletons() {
		
		return set;
	}
}
