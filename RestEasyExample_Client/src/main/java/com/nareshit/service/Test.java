package com.nareshit.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;



public class Test {
	public static void main(String[] args) throws Exception {
		/*//Jersey2.x based Client
		String URL="http://localhost:2525/RestEasyExample/nit/hello/sayHello/{name}";
		String json*/
		
	String url="http://localhost:2525/RestEasyExample/nit/hello/sayHello/name=satish";
		RestTemplate template= new RestTemplate();
	/*	Map<String,Object> map= new HashMap<String,Object>();
		map.put("name","Satish");*/
		String response=template.getForObject(url,String.class);
		System.out.println(response);
/*

		ClientRequest clientRequest=new ClientRequest(URL);
		clientRequest.accept(MediaType.TEXT_PLAIN);
		ClientResponse clientResponse
		=clientRequest.get(ClientResponse.class);
		  String response=(String)clientResponse.getEntity(String.class);
		  System.out.println(clientResponse.getStatus());
		  System.out.println(response);*/
	}

}
