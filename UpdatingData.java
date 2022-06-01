package com.Bridgelabz;

import java.sql.*;

public class UpdatingData {
    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/employeepayroll_service?useSSL=false";
        String userName = "root";
        String password = "sopi@1234";
        String query = "update detailsofemployees set salary=3000000 where name='swapnil' ";
        Connection connection;

        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement = connection.prepareStatement(query);
        int count = statement.executeUpdate();
        System.out.println(count + " row affected" );
        statement.close();
        connection.close();
    }
}

