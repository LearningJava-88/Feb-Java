package com.trainee.rest.jdbc.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

    private static String URL = "jdbc:mysql://localhost:3306/emp_mgmt_sys";
    private static String Username = "root";
    private static String Password = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, Username, Password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return connection;
    }

    public static void printException(SQLException ex) {
    	
    	System.out.println("Exception thrown : "+ex.getMessage());
    	
    }
}
