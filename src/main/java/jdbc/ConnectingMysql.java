package jdbc;

import java.sql.*;

public class ConnectingMysql {
    private static final String CONNECTION_URL_STRING = "jdbc:mysql://localhost:3306/javabrainsdb";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "Password1269";
    private static final String RETRIEVAL_QUERY = "SELECT * FROM users";
    public static void main(String[] args) {

//        Class.forName("com.mysql.cj.jdbc.Driver");
//        try{
//            Connection connection = DriverManager.getConnection(CONNECTION_URL_STRING, DATABASE_USERNAME, DATABASE_PASSWORD);
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(RETRIEVAL_QUERY);
//            String username = "";
//            while(resultSet.next()){
//                 username =   resultSet.getString("id") + ":"+ resultSet.getString("username")
//                         + ":"+resultSet.getString("password") + ":" + resultSet.getString("roles")
//                         + ":" + resultSet.getString("active");
//                System.out.println(username);
//            }
//
//            statement.close();
//            connection.close();
//
//        } catch (SQLException ex){
//            System.out.println(ex);
//        }


        DaoClass daoClass = new DaoClass();
        User mike = new User(5, "mike", "javadev", "ROlE_USER", true);
//        daoClass.editUser(4, mike);
//
//

//
//        System.out.println("Adding a new User");
//        daoClass.addUser(mike);

//        System.out.println("******************");
//        System.out.println("Getting user with id 3");
//        System.out.println(daoClass.getUser(3));
//        System.out.println("******************");

//        System.out.println("Editing user detail");
//        daoClass.editUsername("super", "Superman" );
//        System.out.println("******************");

//        System.out.println("Editing Batman active status");
//        daoClass.editUserStatus("Batman", true);
//        System.out.println("******************");

        System.out.println("Printing out all users ");
        System.out.println(daoClass.getUsers());





    }
}
