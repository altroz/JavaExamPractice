package chapter15.DataBase;

import java.sql.*;

public class DbSavepoint {
	public static void main(String[] args) throws SQLException {
		Connection connection = DbConnector.connectToDb();
		ResultSet resultSet = null;
		// we're using explicit finally block instead of try-with-resource
		// statement in this code.
		try {
			// for commit/roll back we first need to set auto-commit-to false
			connection.setAutoCommit(false);
			Statement statement = connection
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery("SELECT * FROM familyGroup");
			System.out
					.println("Printing the content of the table before inserting");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + " "
						+ resultSet.getString("nickName"));
			}
			System.out.println("Starting to insert rows");
			// first Insert
			resultSet.moveToInsertRow();
			resultSet.updateString("nickname", "Tom");
			resultSet.insertRow();
			System.out.println("Inserted row for Tow");
			// Our savepoint is here
			Savepoint firstSavepoint = connection.setSavepoint();

			// second insert
			resultSet.moveToInsertRow();
			resultSet.updateString("nickname", "Dick");
			resultSet.insertRow();
			System.out.println("Inserted row for Dick");

			// Our second savepoint is here.. after we inserted Dick, we can
			// give a string name for savepoint
			Savepoint secondSavepoint = connection
					.setSavepoint("SavePointForDick");

			// Third Insert
			resultSet.moveToInsertRow();
			resultSet.updateString("nickName", "Harry");
			resultSet.insertRow();
			System.out.println("Inserted row for Harry");

			// Third Savepoint is here... for Harray

			Savepoint thirdSavepoint = connection.setSavepoint("For Harry");
			System.out.println("Table updating completed....");

			// rollbac to the state when Dick was inserted;
			// So the insert for Harry will be Lost;

			System.out
					.println("Rolling back to the state when Tom and Dick were inserted");
			connection.rollback(secondSavepoint);
			connection.commit();
			System.out
					.println("Printing the content of the table after commit");
			resultSet = statement.executeQuery("SELECT * FROM familyGroup");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + " "
						+ resultSet.getString("nickName"));
			}

		} catch (SQLException e) {
			System.out
					.println("Something gone wrong, couldn't add a contact in familyGroup");
			connection.rollback();
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.close();
			if (connection != null)
				resultSet.close();
		}
	}
}
