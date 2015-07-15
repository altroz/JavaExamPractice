package chapter15.DbQuery;

import java.sql.*;

import chapter15.DbConnect1.DbConnector;

public class DbQuery4 {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement
						.executeQuery("SELECT firstName, email FROM contact WHERE "
								+ "firstName = \"Michael\" ")) {
			System.out.println("fName \t email");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("firstName") + "\t"
						+ resultSet.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
