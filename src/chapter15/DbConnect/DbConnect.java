package chapter15.DbConnect;

import java.sql.*;

public class DbConnect {
	public static void main(String[] args) {
		String url = "jdbc: mysql://localhost:3306/";
		String database = "addressBook";
		String userName = "root";
		String password = "mysql123";

		try (Connection connection = DriverManager.getConnection(
				url + database, userName, password)) {
			System.out.println("Database Coonect: Successful");
		} catch (Exception e) {
			System.out.println("Database connection: failed");
			e.printStackTrace();
		}
	}
}
