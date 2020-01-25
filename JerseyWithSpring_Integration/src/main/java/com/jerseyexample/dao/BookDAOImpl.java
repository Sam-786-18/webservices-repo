package com.jerseyexample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jerseyexample.domain.Book;
@Repository
public class BookDAOImpl implements BookDAO {
	@Autowired
private DataSource datasource;
	@Override
	public int registerBook(Book book) {
		int count=0;
		Connection con=null;
		try {
			con=datasource.getConnection();
			String sql="insert into bookdetail values(?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, book.getIsbn());
			pst.setString(2, book.getTitle());
			pst.setString(3, book.getAuthor());
			pst.setString(4, book.getPublication());
			pst.setDouble(5, book.getPrice());
			count=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
			}
		}
		return count;
	}

}
