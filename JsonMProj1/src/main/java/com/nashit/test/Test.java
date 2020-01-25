package com.nashit.test;

import com.nareshit.bean.StudentInfo;
import com.nareshit.util.JsonUtil;

public class Test {
public static void main(String[] args) {
	StudentInfo student =new StudentInfo();
	student.setStudId(101);
	student.setStudName("satish");
	student.setStudMobile("98966666");
	String jsonStudent=JsonUtil.convertJavaToJson(student);
	System.out.println(jsonStudent);
	
	StudentInfo std=JsonUtil.convertJsonToJava(jsonStudent, StudentInfo.class);
	System.out.println(std.getStudId()+" "+std.getStudName()+" "+std.getStudMobile());
	
}
}
