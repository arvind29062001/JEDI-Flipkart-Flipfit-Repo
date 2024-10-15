package com.flipfit.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection singleInstance = null;

    /**
     *
     * @return Connection
     * @throws SQLException
     * @author Shakti Singh
     */
    public static Connection connect() throws SQLException {
        if (singleInstance == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/FlipFit", "root", "Arvind@123");
                System.out.println("Database connected!");
                singleInstance = conn;
                return conn;
            } catch (ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
        return singleInstance;
    }
}
