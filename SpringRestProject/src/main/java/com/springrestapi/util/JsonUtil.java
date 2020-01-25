package com.springrestapi.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	public static ObjectMapper mapper=null;
	static {
		mapper=new ObjectMapper();
	}
	
public static String javaToJson(Object obj) {
	String json= "{}";
	
	try {
		json=mapper.writeValueAsString(obj);
	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return json;
}
public static <T> T jsonToJava(Class<T>cls,String str) {
	T response=null;
	try {
		response=mapper.readValue(str, cls);
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return response;
}
}
