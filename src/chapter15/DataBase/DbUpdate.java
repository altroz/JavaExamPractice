package chapter15.DataBase;

import java.sql.*;

import chapter15.DbConnect1.DbConnector;

public class DbUpdate {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement(
						ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement
						.executeQuery("SELECT * FROM contact WHERE firstName = \"Michael\"")) {
			System.out.println("Before the update");
			System.out.println("id\tfName\tlName\tEmail\t\tphoneNo");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t"
						+ resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t"
						+ resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}

			resultSet.absolute(1);
			resultSet.updateString("phoneNo", "+919876543210");
			System.out.println("After The Update");
			System.out.println("id\tfName\tlName\tEmail\t\tphoneNo");
			resultSet.beforeFirst();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t"
						+ resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t"
						+ resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}
}
