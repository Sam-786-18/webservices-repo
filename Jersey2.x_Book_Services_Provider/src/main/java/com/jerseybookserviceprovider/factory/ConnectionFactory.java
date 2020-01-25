package com.jerseybookserviceprovider.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
static {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Exection occured while loading the driver class:"+e.getMessage());
	}
}
public static Connection getConnection() throws SQLException {
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String un="satish";
	String pass="lenovo";
	Connection con=DriverManager.getConnection(url,un,pass);
	return con;
}
}
