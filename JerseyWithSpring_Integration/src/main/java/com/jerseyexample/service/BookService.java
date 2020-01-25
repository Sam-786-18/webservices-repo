package com.jerseyexample.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerseyexample.dao.BookDAO;
import com.jerseyexample.domain.Book;
import com.jerseyexample.domain.ResponseDTO;
import com.jerseyexample.util.JsonUtil;
/*table: create table bookdetail(isbn int(10),title 
varchar(20),author varchar(20),publication
varchar(20),price float(10,2));*/
@Path("/book")
@Service
public class BookService {
	@Autowired
 private BookDAO bookDAO;
 @POST
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
 @Path("getBook")
 public String resgiterBook(String jsonBook) {
	 Book book=JsonUtil.convertJsonToJava(Book.class, jsonBook);
	 String msg="Registration is Failure! Please try again";
	 ResponseDTO responseDTO=new ResponseDTO();
	 responseDTO.setMsg(msg);
	 int count=bookDAO.registerBook(book);
	 if(count>0) {
		 msg="Resgistration is Success";
		 responseDTO.setMsg(msg);
		 responseDTO.setStatus((byte)1);
		 responseDTO.setData(book.getIsbn().toString());
	 }
	 System.out.println("Respose of registerBook::"+responseDTO.getMsg());
	 String jsonResponseDTO=JsonUtil.convertJavaToJson(responseDTO);
	 return jsonResponseDTO;
 }
}
