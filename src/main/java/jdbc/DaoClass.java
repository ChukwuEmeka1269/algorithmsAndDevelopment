package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoClass {
    private static final String URL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/javabrainsdb";
    private static final String DRIVER_CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "Password1269";
    private static final String INSERT_QUERY = "INSERT INTO users VALUES(?,?,?,?,?)";
    private static final String SELECT_QUERY = "SELECT * FROM users";


    private Connection connection ;

    private void makeConnection() throws ClassNotFoundException{

        try{
            Class.forName(DRIVER_CLASSNAME);
            connection = DriverManager.getConnection(URL_CONNECTION_STRING, DATABASE_USERNAME, DATABASE_PASSWORD);

        }catch (SQLException ex){
            System.out.println(ex);
        }

    }

    public void addUser(User newUser){
        try{
            makeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY); //PreparedStatement are used for DML
            preparedStatement.setInt(1, newUser.getId());
            preparedStatement.setString(2, newUser.getUsername());
            preparedStatement.setString(3, newUser.getPassword());
            preparedStatement.setString(4, newUser.getRoles());
            preparedStatement.setBoolean(5, newUser.isActive());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");


            preparedStatement.close();


        }catch(Exception ex){
            System.out.println(ex);
        }finally{
            try{
                connection.close();
            }catch (SQLException exception){
                System.out.println(exception);
            }
        }
    }

    public User getUser(int id){


        try{
            String SELECT_USER_QUERY = "SELECT * FROM users WHERE id = " + id;
            User user = new User();
            user.setId(id);
            String userData;
            makeConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_USER_QUERY);

            resultSet.next();

            userData =   resultSet.getString("id") + ":"+ resultSet.getString("username")
                    + ":"+resultSet.getString("password") + ":" + resultSet.getString("roles")
                    + ":" + resultSet.getString("active");

            System.out.println(userData);

            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setRoles(resultSet.getString("roles"));
            user.setActive(resultSet.getBoolean("active"));

            statement.close();

            return user;


        }catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            try{
                connection.close();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }

        return null;
    }

    public List<User> getUsers(){
        List<User> users = new ArrayList<>();

        try{
            makeConnection();
//            connection.setAutoCommit(true);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            String userData = "";



            while(resultSet.next()){
                User user = new User();
                userData =   resultSet.getString("id") + ":"+ resultSet.getString("username")
                        + ":"+resultSet.getString("password") + ":" + resultSet.getString("roles")
                        + ":" + resultSet.getString("active");

                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setRoles(resultSet.getString("roles"));
                user.setActive(resultSet.getBoolean("active"));

                users.add(user);

//                users.add(userData);

            }
            resultSet.close();

            users.forEach(System.out::println);

            statement.close();

            return users;


        }catch (Exception ex){
            System.out.println(ex);
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }

        return null;
    }

    public void editUser(int userId, User user){
        try{
            String queryString = "UPDATE users SET id = "+ userId + ", username = "+ user.getUsername() + " , password = "+ user.getPassword() +
                    ", roles = "+ user.getRoles()+ " WHERE id = " + userId;
            makeConnection();
            PreparedStatement statement = connection.prepareStatement(queryString);
            statement.setInt(1, userId);
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getRoles());
            statement.setBoolean(5, user.isActive());

            int rowsAffected = statement.executeUpdate();


            System.out.println(rowsAffected + " rows affected. User has been updated.");

            statement.close();
        }catch (Exception ex){
            System.out.println(ex);
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }
    }

    public void editUserStatus(String username, boolean isActive){
        try{
            String queryString = "UPDATE users SET active = '" + isActive + "' WHERE username = '" + username + "'";
            makeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows + " row(s) affected. ");

            preparedStatement.close();

        }catch(Exception ex){
            System.out.println(ex);
        }finally {
            try{
                connection.close();
            } catch (SQLException ex){
                System.out.println(ex);
            }
        }
    }

    public void editUsername(String username, String newUsername){
        try{
            String queryString = "UPDATE users SET username = '" + newUsername + "' WHERE username = '" + username + "'";
            makeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows + " row(s) affected. ");

            preparedStatement.close();

        }catch(Exception ex){
            System.out.println(ex);
        }finally {
            try{
                connection.close();
            } catch (SQLException ex){
                System.out.println(ex);
            }
        }
    }

    public void editUserPassword(String username, String newPassword){
        try{
            String queryString = "UPDATE users SET password = '" + newPassword + "' WHERE username = '" + username + "'";
            makeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows + " row(s) affected. ");

            preparedStatement.close();

        }catch(Exception ex){
            System.out.println(ex);
        }finally {
            try{
                connection.close();
            } catch (SQLException ex){
                System.out.println(ex);
            }
        }
    }





}
