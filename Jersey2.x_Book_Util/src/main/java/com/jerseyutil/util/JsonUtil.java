package com.jerseyutil.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	public static ObjectMapper mapper=null;
			static {
		 mapper=new ObjectMapper();
		 }
 public static String convertJavaToJson(Object obj) {
	 String jsonStr="{}";
	 
	 try {
		jsonStr=mapper.writeValueAsString(obj);
		
		
	} catch ( JsonProcessingException e) {
	
		e.printStackTrace();
	}
	 return jsonStr;
 }
 public static <T> T convertJsonToJava(String jsonStr,Class<T> clazz) {
	 T response=null;
	 try {
		response=mapper.readValue(jsonStr, clazz);
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
