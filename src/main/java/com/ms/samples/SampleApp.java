package com.ms.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleApp {

	public static void main(String[] args) {
		
		// Create a variable for the connection string.
//	    String connectionUrl = "jdbc:sqlserver://mytestdbserver123.database.windows.net:1433;database=test;user=hcl@mytestdbserver123;password=test$123;";
	    String connectionUrl = "jdbc:sqlserver://mytestdbserver123.database.windows.net:1433;database=test;user=john@impraveshkumaroutlook.onmicrosoft.com@mytestdbserver123;password=TechnoLabs0;";
//	    Wota1237
	    try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
	        String SQL = "SELECT * from Persons";
	        ResultSet rs = stmt.executeQuery(SQL);

	        // Iterate through the data in the result set and display it.
	        while (rs.next()) {
	            System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
	        }
	    }
	    // Handle any errors that may have occurred.
	    catch (SQLException e) {
	        e.printStackTrace();
	    }

	}

}
