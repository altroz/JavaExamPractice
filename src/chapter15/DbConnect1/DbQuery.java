package chapter15.DbConnect1;

import java.sql.*;

public class DbQuery {
	public static void main(String[] args) {
		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement
						.executeQuery("SELECT * FROM contact")) {
			System.out.println("ID\tfName\tlName\tEmail\t\tphoneNo");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t"
						+ resultSet.getString("FirstName") + "\t"
						+ resultSet.getString("LastName") + "\t"
						+ resultSet.getString("Email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}
}
