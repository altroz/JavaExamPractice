package chapter15.DataBase;

import java.sql.*;

import chapter15.DbConnect1.DbConnector;

public class DbDelete {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement(
						ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet1 = statement
						.executeQuery("SELECT * FROM contact WHERE firstName = \"John\"")) {
			if (resultSet1.next()) {
				resultSet1.deleteRow();
			}
			resultSet1.close();
			// now fetch again from the database.
			try (ResultSet resultSet2 = statement
					.executeQuery("SELECT * FROM contact")) {
				System.out.println("After the deletion");
				System.out.println("id\tfName\tlName\tEmail\t\tphone");
			}
			while (resultSet2.next()) {
				System.out.println(resultSet2.getInt("id") + "\t"
						+ resultSet2.getString("firstName") + "\t"
						+ resultSet2.getString("lastName") + "\t"
						+ resultSet2.getString("Email") + "\t"
						+ resultSet2.getString("phoneNo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
