package com.Bridgelabz;

import java.sql.*;

public class Refactored2UC4 {
    public static void main(String[] args) throws SQLException {


        String jdbcUrl = "jdbc:mysql://localhost:3306/employeepayroll_service?useSSL=false";
        String userName = "root";
        String password = "sopi@1234";
        String query = "select * from detailsofemployees";
        Connection connection;

        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet result = statement.executeQuery();

        System.out.println("ID  | NAME |  SALARY  | START_DATE");
        while (result.next()) {
            String id = result.getString("id");
            String name =  result.getString("name");
            String salary = result.getString("salary");
            String date = result.getString("start");
            System.out.println(id + " | "+name + " | "+salary + " | "+date);
        }

        statement.close();
        connection.close();

        }
    }



