package com.pbo.prak.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class MysqlUtility {
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DB_NAME = "pbo11_jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "Dhimasreza123_";
    private static final String JDBC_BASE_URL = "jdbc:mysql://" + HOST + ":" + PORT;
    private static final String JDBC_URL = JDBC_BASE_URL + "/" + DB_NAME + "?serverTimezone=UTC";

    private MysqlUtility() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    public static void initializeDatabase() throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_BASE_URL + "/?serverTimezone=UTC", USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DB_NAME);
        }

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(
                "CREATE TABLE IF NOT EXISTS mahasiswa ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "nama VARCHAR(100) NOT NULL"
                    + ")"
            );
        }
    }
}
