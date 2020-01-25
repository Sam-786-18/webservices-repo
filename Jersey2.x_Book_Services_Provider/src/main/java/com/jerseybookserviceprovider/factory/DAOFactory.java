package com.jerseybookserviceprovider.factory;

import com.jerseybookserviceprovider.dao.BookDAO;

public class DAOFactory {
private static BookDAO bookDAO;
static {
	bookDAO=new BookDAO();
	
}
public static BookDAO getBookDAO() {
	return bookDAO;
}
}
