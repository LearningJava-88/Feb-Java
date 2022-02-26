package com.trainee.rest.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertStatementExample {
    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (id, name, email, country, password) VALUES " +
        " (?, ?, ?, ?, ?);";
    

    public static void main(String[] argv) throws SQLException {
    	InsertStatementExample createTableExample = new InsertStatementExample();
        createTableExample.insertRecord();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        Connection connection = JDBCUtils.getConnection();
        
        
        try (
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Someone");
            preparedStatement.setString(3, "mail");
            preparedStatement.setString(4, "Hyd");
            preparedStatement.setString(5, "pwd");
           

            
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JDBCUtils.printException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}