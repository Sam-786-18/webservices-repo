package com.nareshit.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	public static ObjectMapper mapper=null;
	static String json;
	static {
		mapper=new ObjectMapper();
		}
	public static String convertJavaToJson(Object obj) {
		try {
			json=mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		return json;
	}
public static <T> T convertJsonToJava(String jsonStr,Class<T> clazz) {
	T response=null;
	try {
		response=mapper.readValue(jsonStr, clazz);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return response;
}
	

}