package com.trainee.rest.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatementExample {

  
	private static final String UPDATE_SQL = "update users set name = ? where id = ?;";

    public static void main(String[] argv) throws SQLException {
    	UpdateStatementExample updateStatementExample = new UpdateStatementExample();
        updateStatementExample.updateRecord();
    }

    public void updateRecord() throws SQLException {
    	
           Connection connection = JDBCUtils.getConnection();
         
    	
        System.out.println(UPDATE_SQL);
        // Step 1: Establishing a Connection
        try (
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SQL)) {
            preparedStatement.setString(1, "Ram");
            preparedStatement.setInt(2, 1);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JDBCUtils.printException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}