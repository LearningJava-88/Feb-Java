package com.trainee.rest.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementExample {

    private static final String CREATE = "create table users (\r\n" + "  id  int(3) primary key,\r\n" +
        "  name varchar(20),\r\n" + "  email varchar(20),\r\n" + "  country varchar(20),\r\n" +
        "  password varchar(20)\r\n" + "  );";

    public static void main(String[] argv) throws SQLException {
    	CreateStatementExample createTableExample = new CreateStatementExample();
        createTableExample.createTable();
    }

    public void createTable() throws SQLException {

        System.out.println(CREATE);
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(CREATE);

        } catch (SQLException e) {
            // print SQL exception information
            JDBCUtils.printException(e);
        }
    }
}