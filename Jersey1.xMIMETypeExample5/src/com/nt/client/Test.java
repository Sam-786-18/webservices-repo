package com.nt.client;

import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nt.domain.Product;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class Test {

	public static void main(String[] args) throws JAXBException {
	
String URL="http://localhost:2525/Jersey1.xExample1/products/registerProduct";
Client client=Client.create();
WebResource webResource=client.resource(URL);
Builder builder=webResource.type(MediaType.APPLICATION_XML);
builder.accept(MediaType.TEXT_PLAIN);

Product product=new Product();
product.setPid(201);
product.setPname("mouse");
product.setPrice(900.3);
JAXBContext jaxbContext=JAXBContext.newInstance(Product.class);
Marshaller masrhaller=jaxbContext.createMarshaller();
StringWriter writer=new StringWriter();
masrhaller.marshal(product, writer);
String productXML=new String();
ClientResponse clientResponse=builder.post(ClientResponse.class,productXML);
String response=clientResponse.getEntity(String.class);
System.out.println(clientResponse.getStatus()+"  "+clientResponse.getStatusInfo());
System.out.println(response);
	}

}
