package jdbc;

import java.sql.*;

public class ConnectingWithPreparedStatements {
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/javabrainsdb";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "Password1269";
    private static final String SQL_QUERY_STATEMENT = "INSERT INTO users values (?,?, ?, ?, ?)";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection connection = DriverManager.getConnection(CONNECTION_URL, DATABASE_USERNAME, DATABASE_PASSWORD)){
            PreparedStatement statement = connection.prepareStatement(SQL_QUERY_STATEMENT);
            statement.setInt(1, 3);
            statement.setString(2, "Batman");
            statement.setString(3, "superhero");
            statement.setString(4, "ROLE_USER");
            statement.setBoolean(5, false);
            int affectRows = statement.executeUpdate();

            System.out.println(affectRows + " row(s) affected.");


            statement.close();

        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
}
