import java.sql.*;

public class RetrievingData {

    public static void main(String[] args) throws SQLException {

            String jdbcUrl = "jdbc:mysql://localhost:3306/employeepayroll_service?useSSL=false";
            String userName = "root";
            String password = "sopi@1234";
            String query = "select * from detailsofemployees";
            Connection connection;

            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            String userData = "";
            while(result.next()){
                userData = result.getInt(1)+ " | " + result.getString(2)+" | " + result.getString(3)+" | "+result.getString(4);
                System.out.println(userData);
            }
            statement.close();
            connection.close();
        }
    }

