package com.jerseyexample.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jerseyexample.service.BookServiceClient;
import com.jerseyutil.domain.Book;
import com.jerseyutil.domain.ResponseDTO;

public class BookServlet extends HttpServlet {
private BookServiceClient bookServiceClinet;
public void init(){
	
	BookServiceClient bookServiceClient =new BookServiceClient();
	
}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Book book=new Book();
		System.out.println(req.getParameter("isbn"));
		book.setIsbn(req.getParameter("isbn"));
		book.setAuthor(req.getParameter("author"));
		book.setTitle(req.getParameter("title"));
		book.setPrice(Double.parseDouble(req.getParameter("price")));
		System.out.println(req.getParameter("price"));
		System.out.println(book);
		ResponseDTO responseDTO=bookServiceClinet.saveBookDetails(book);
		System.out.println(responseDTO);
		req.setAttribute("responseDTO", responseDTO);
		String target="/WEB-INF/pages/regBook.jsp";
		RequestDispatcher rd=req.getRequestDispatcher(target);
		rd.forward(req, res);
	}
}
