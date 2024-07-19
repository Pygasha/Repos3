package jm.task.core.jdbc.util;

import jm.task.core.jdbc.Main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL="jdbc:mysql://localhost:3306/myDB";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    private static Connection connection;

    public static void main(String[] args) {

    }

    public static Connection getConnection(){

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("Соединение с БД установлено");
        } catch (SQLException e) {
            System.out.println("Соединение с БД неустановленно");

        }
        return connection;
    }
}