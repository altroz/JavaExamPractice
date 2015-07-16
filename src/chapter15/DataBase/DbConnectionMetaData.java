package chapter15.DataBase;

import java.sql.*;

import chapter15.DbConnect1.DbConnector;

public class DbConnectionMetaData {
	public static void main(String[] args) throws SQLException {
		Connection connection = DbConnector.connectToDb();
		DatabaseMetaData metaData = connection.getMetaData();

		System.out
				.println("Displaying some of the database metadata from the connection object");
		System.out.println("Database is: " + metaData.getDatabaseProductName()
				+ " " + metaData.getDatabaseProductVersion());
		System.out.println("The URL for this connection is: "
				+ metaData.getURL());
		System.out.println("UserName is: " + metaData.getUserName());
		System.out.println("Maximum no. of rows you can insert is: "
				+ metaData.getMaxRowSize());
	}
}
