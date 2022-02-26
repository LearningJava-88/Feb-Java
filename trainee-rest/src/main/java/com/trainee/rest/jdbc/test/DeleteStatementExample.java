package com.trainee.rest.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatementExample {
    private static final String DELETE = "delete from users where id = 1";
    
    public static void main(String[] argv) throws SQLException {
        DeleteStatementExample deleteExample = new DeleteStatementExample();
        deleteExample.deleteRecord();
    }

    public void deleteRecord() throws SQLException {
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();

           ) {

        	 Statement statement = connection.createStatement();

            // Step 3: Execute the query or update query
            statement.execute(DELETE);

        } catch (SQLException e) {
            // print SQL exception information
            JDBCUtils.printException(e);
        }
    }
}