package com.resteasy.cfg;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.resteasy.service.HelloResource;

public class MyApplication extends Application {
private static Set<Object> set=new HashSet<>();
public MyApplication() {
	set.add(new HelloResource());
}
@Override
	public Set<Object> getSingletons() {
	return set;
	}
}
