package com.Bridgelabz;

import java.sql.*;

public class UpdatingData {
    public static Connection connection;

    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/employeepayroll_service?useSSL=false";
        String userName = "root";
        String password = "sopi@1234";
        String query = "update detailsofemployees set salary=3000000 where name='swapnil' ";


        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement = connection.prepareStatement(query);
        int count = statement.executeUpdate();
        System.out.println(count + " row affected");
        statement.close();
        connection.close();
    }

    public static String reteriveData() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/employeepayroll_service?useSSL=false";
        String userName = "root";
        String password = "sopi@1234";
        String query = "select salary from detailsofemployees where name ='swapnil'";

        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        String salary = " ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            for(int i=0; i<=2; i++)
             salary = (resultSet.getString("salary"));
            System.out.println(salary);
        }
        return salary;
    }

}