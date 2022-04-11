package jdbc.timbul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Testing {
    public static final String DB_NAME = "Newdb.db";
    public static final String CONTACTS_TABLE = "employee";
    public static final String NAME_COLUMN = "name";
    public static final String PHONE_COLUMN = "phone";
    public static final String EMAIL_COLUMN = "email";
    private static final String CONNECTION_URL = "jdbc:sqlite:/Users/user/Desktop/algorithms/src/main/resources/" + DB_NAME;

    static Connection connection = null;
    static Statement statement;
    public static void main(String[] args) {

        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(CONNECTION_URL);
            statement = connection.createStatement();

            createTable(statement, NAME_COLUMN, PHONE_COLUMN, EMAIL_COLUMN);

        }catch (Exception ex){
            System.out.println("Something went wrong"+ ex.getMessage());
        }finally{

            try{
                if(statement != null){
                    statement.close();
                }
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException ex){
                System.out.println("Something went wrong " + ex.getMessage());
            }
        }

    }

    public static void createTable(Statement statement, String name, String phone, String email)throws SQLException {
        statement.execute("CREATE TABLE " + CONTACTS_TABLE + "("
                + name + " TEXT, " + phone + " INTEGER, "+ email + " TEXT )" );
    }
}
