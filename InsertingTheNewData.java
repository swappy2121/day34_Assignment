package com.Bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingTheNewData {
    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/employeepayroll_service?useSSL=false";
        String userName = "root";
        String password = "sopi@1234";
        String query = "insert into detailsofemployees values(2560,'rahul','500000','2022-04-03') ";
        Connection connection;

        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement = connection.prepareStatement(query);
        int count = statement.executeUpdate();
        System.out.println(count + " row affected" );
        statement.close();
        connection.close();
    }
}
