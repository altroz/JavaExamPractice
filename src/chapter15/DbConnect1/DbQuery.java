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
				int numOfColumns = 0;
				for (int i = 1; i <= numOfColumns; i++) {
					System.out.println(resultSet.getObject(i) + "\t");
					System.out.println(" ");
				}
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}
}
