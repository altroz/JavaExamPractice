package chapter15.DataBase;

import java.sql.*;

import chapter15.DbConnect1.DbConnector;

public class DbTransaction {
	public static void main(String[] args) throws SQLException {
		Connection connection = DbConnector.connectToDb();
		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;

		// we're using explicit finally blocks instead of try-with resource
		// statement in this code
		try {
			// for commit/ rollback we first need to set auto-commit to false.
			connection.setAutoCommit(false);
			Statement statement = connection
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			resultSet1 = statement.executeQuery("SELECT * FROM familyGroup");
			resultSet1.moveToInsertRow();
			resultSet1.updateString("nickName", "Sam Uncle");
			// Updating here... but this change will be last if a rollback
			// happens.
			resultSet1.insertRow();
			System.out.println("First table updated...");

			resultSet2 = statement.executeQuery("SELECT * FROM contact");
			resultSet2.moveToInsertRow();
			resultSet2.updateString("firstName", "Samuel");
			resultSet2.updateString("lastName", "Uncle");
			resultSet2.updateString("email", "sam@abc.com");
			resultSet2.updateString("phoneNo", "+919876543210");
			// Update here... but this change will be lost of a rollback
			resultSet2.insertRow();
			System.out.println("Both tables updated, committing now");
			// We're committing the changes for both the tables only now

			connection.commit();
		} catch (SQLException e) {
			System.out
					.println("Something gone wrong, couldn't add a contact in familyGroup");
			connection.rollback();
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
				resultSet1.close();
				resultSet2.close();
			}
		}
	}
}
