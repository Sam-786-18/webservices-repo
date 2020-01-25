package com.nareshit.client;


import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class Test {
	public static void main(String[] args)  {
		String url="http://localhost:2525/Jersey1.xExample3/products/getProductInJson;pid=301;pname=keybord";
		Client client=Client.create();
		  WebResource resource=client.resource(url);
		 Builder builder=resource.accept(MediaType.APPLICATION_JSON);
		  ClientResponse clientResponse=builder.get(ClientResponse.class);
		  String jsonResponse=clientResponse.getEntity(String.class);
		  System.out.println(clientResponse.getStatus()+" -->"+clientResponse.getStatusInfo());
		  System.out.println(jsonResponse);
			}
}
