package com.jerseybookserviceprovider.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jerseybookserviceprovider.factory.DAOFactory;
import com.jerseyutil.domain.Book;
import com.jerseyutil.domain.ResponseDTO;
import com.jerseyutil.util.JsonUtil;

@Path("books")
public class BookResource {
	/*private static final String  STATUS_FAILURE;
	private static final String  STATUS_SUCCESS;*/
@POST
@Produces(MediaType.APPLICATION_JSON)
@Path("/registerBook")
@Consumes(MediaType.APPLICATION_JSON)
public ResponseDTO registerBook(String jsonBook) {
	//System.out.println("Server::"+jsonBook);
	ResponseDTO responseDTO =new ResponseDTO();

	responseDTO.setMessage("Server Problem,Book Details Could not be recieved");
		Book book =JsonUtil.convertJsonToJava(jsonBook,Book.class);
		//System.out.println(book.getAuthor());
	int count=DAOFactory.getBookDAO().registerBook(book);

		System.out.println(count);
		if(count>0) {
			responseDTO.setStatus((byte)1);
			
			responseDTO.setData(book.getIsbn().toString());
			responseDTO.setMessage("Book Details saved Sucessfully");
		}
		else {
			responseDTO.setMessage("Book Details could not saved!try agian again");
		}
		System.out.println("Server Response:"+responseDTO.getMessage());
		System.out.println(book.getAuthor()+" "+book.getIsbn().toString());
	
	/*else {
		System.out.println("Data not correct");
	}*/
	return responseDTO;
}
}
