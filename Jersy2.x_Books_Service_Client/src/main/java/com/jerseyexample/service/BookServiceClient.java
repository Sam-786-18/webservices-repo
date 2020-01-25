package com.jerseyexample.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jerseyutil.domain.Book;
import com.jerseyutil.domain.ResponseDTO;
import com.jerseyutil.util.JsonUtil;


public class BookServiceClient {
public ResponseDTO saveBookDetails(Book book) {
	String URL="http://localhost:2525/Jersey2.x_Book_Services_Provider/books/registerBook";
	String jsonBook=JsonUtil.convertJavaToJson(book);
Client client=ClientBuilder.newClient();
WebTarget webTarget=client.target(URL);
Builder builder=webTarget.request();
builder.accept(MediaType.APPLICATION_JSON);
Response response=builder.post(Entity.entity(jsonBook, MediaType.APPLICATION_JSON),Response.class);
System.out.println(response.getStatus()+" "+response.getStatusInfo());
String jsonResponse=response.readEntity(String.class);
ResponseDTO responseDTO=JsonUtil.convertJsonToJava(jsonResponse, ResponseDTO.class);
System.out.println(response);

return responseDTO;

}
}
