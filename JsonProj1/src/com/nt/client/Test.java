package com.nt.client;


import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.nt.bean.Student;

public class Test {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
Student stud =new Student();
stud.setStudId(101);
stud.setStudName("satish");
stud.setStudMobile("989899866");
ObjectMapper mapper=new ObjectMapper();

String json=mapper.writeValueAsString(stud);
System.out.println(json);
Student stud1=mapper.readValue(json, Student.class);
System.out.println(stud1.getStudId()+" "+stud1.getStudName()+" "+stud1.getStudMobile());


	}

}
