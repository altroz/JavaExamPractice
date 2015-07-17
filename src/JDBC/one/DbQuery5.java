package JDBC.one;

import javax.sql.rowset.*;
import java.sql.*;

public class DbQuery5 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/addressBook";
		String userName = "root";
		String password = "mySql123";

		try {
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			rowSet.setUrl(url);
			rowSet.setUsername(userName);
			rowSet.setPassword(password);
			rowSet.setCommand("SELECT * FROM contact");
			rowSet.execute();

			System.out.println("id\tfName\tlName\tEmail\t\tphoneNo");
			while (rowSet.next()) {
				System.out.println(rowSet.getInt("id") + "\t"
						+ rowSet.getString("FirstName") + "\t"
						+ rowSet.getString("LastName") + "\t"
						+ rowSet.getString("Email") + "\t"
						+ rowSet.getString("Phone No") + "\t");
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
