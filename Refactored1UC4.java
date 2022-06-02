package com.Bridgelabz;

import java.sql.*;

public class Refactored1UC4 {
    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/employeepayroll_service?useSSL=false";
        String userName = "root";
        String password = "sopi@1234";
        String query = "select * from detailsofemployees";
        Connection connection;

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            System.out.println("Name of employees : ");
            while (result.next()) {
                String name = result.getString("name");
                System.out.print(name + " \n");
            }
        } catch (SQLException exec) {
            exec.printStackTrace();
        }
    }
}


