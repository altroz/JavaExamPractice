package chapter15.DataBase;

import java.sql.*;

import chapter15.DbConnect1.DbConnector;

public class DbCreateTable {
	public static void main(String[] args) {
		try (Connection connection = DbConnector.connectToDb();) {
			// use CREATE TABLE SQL statement to create table familyGroup.
			int result = Statement
					.executeUpdate("CREATE TABLE "
							+ "familyGroup(id int not null auto_increament, nickName varchar(30) not null, primary key(id));");
			System.out.println("Table created successfully");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}
}
