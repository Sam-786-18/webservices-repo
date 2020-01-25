package com.jerseybookserviceprovider.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jerseybookserviceprovider.factory.ConnectionFactory;
import com.jerseyutil.domain.Book;

public class BookDAO  {
private static final String SQL_REGISTER_BOOK ="insert into Books_Details values(?,?,?,?)";
public int registerBook(Book book) {
	int count=0;
	try {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement(SQL_REGISTER_BOOK);
		pst.setString(1, book.getIsbn());
		pst.setString(2, book.getAuthor());
		pst.setString(3, book.getTitle());
		pst.setDouble(4, book.getPrice());
		count=pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return count;
}

}
