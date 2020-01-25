package com.jerseyexample.util;

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
	public static <T> T convertJsonToJava(Class<T> clazz, String json) {
		T response=null; 
	try {
		response=mapper.readValue(json, clazz);
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
	public static String convertJavaToJson (Object obj) {
		String jsonStr= "";
		
		try {
			jsonStr=mapper.writeValueAsString(obj);
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
		
	
return jsonStr;
	}
}
