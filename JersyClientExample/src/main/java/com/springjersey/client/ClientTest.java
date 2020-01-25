package com.springjersey.client;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.springjersey.domain.Book;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

/**
 * Hello world!
 *
 */
public class ClientTest 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
       String URL="http://localhost:2525/JerseyWithSpring_Integration/book/getBook";
       Book book=new Book();
       book.setIsbn(302);
       book.setTitle("java");
       book.setAuthor("satish");
       book.setPublication("nit");
       book.setPrice(1990.2);
       ObjectMapper mapper=new ObjectMapper();
       String jsonBook=mapper.writeValueAsString(book);
       Client client=Client.create();
       WebResource resource=client.resource(URL);
       Builder builder=resource.accept(MediaType.APPLICATION_JSON);
       builder.type(MediaType.APPLICATION_JSON);
       ClientResponse clientResponse=builder.post(ClientResponse.class,jsonBook);
       System.out.println(clientResponse.getStatus()+" "+clientResponse.getStatusInfo());
       System.out.println(clientResponse.getEntity(String.class));
       
    }
}
