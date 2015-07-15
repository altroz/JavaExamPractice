package chapter15.DbConnect1;

import java.sql.*;

public class DbConnector {
	public static Connection connectToDb() throws SQLException {
		String url = "jdbc: mysql://localhost: 3306/";
		String database = "addressBook";
		String userName = "root";
		String password = "mysql123";

		return DriverManager.getConnection(url + database, userName, password);
	}
}
