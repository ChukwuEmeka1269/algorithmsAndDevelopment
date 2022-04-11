package jdbc.timbul;

import java.sql.*;

public class SqliteJdbc {
    public static final String DB_NAME = "testdb.db";
    public static final String CONTACTS_TABLE = "contacts";
    public static final String NAME_COLUMN = "name";
    public static final String PHONE_COLUMN = "phone";
    public static final String EMAIL_COLUMN = "email";
    private static final String CONNECTION_URL = "jdbc:sqlite:/Users/user/Desktop/algorithms/src/main/resources/" + DB_NAME;
    private static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS " +
                                                    CONTACTS_TABLE + " ("+
                                                    NAME_COLUMN+" TEXT,"+
                                                    PHONE_COLUMN + " INTEGER, "+
                                                    EMAIL_COLUMN+" TEXT)";
    private static final String INSERT_INTO_TABLE_QUERY = "INSERT INTO "+
                                                    CONTACTS_TABLE + " ("+
                                                    NAME_COLUMN +", "+
                                                    PHONE_COLUMN+", "+
                                                    EMAIL_COLUMN +") " +
                                                        "VALUES ('Beeman', 90707302707, 'bee@dmail.com')";
    private static final String UPDATE_TABLE_QUERY = "UPDATE "+
                                                    CONTACTS_TABLE+ " SET "+
                                                    EMAIL_COLUMN+ " = 'speedemon@dmail.com' WHERE"+
                                                    NAME_COLUMN+ "='Flash'";

    public static final String DROP_TABLE_QUERY = "DROP TABLE IF EXISTS " +
                                                    CONTACTS_TABLE;

    public static final String SELECT_ALL_CONTACTS = "SELECT * FROM "+ CONTACTS_TABLE;

    private static final String DELETE_RECORD_QUERY = "DELETE FROM " +
                                                    CONTACTS_TABLE+" WHERE "+
                                                    NAME_COLUMN+ " = 'Beeman'";
    static Connection connection = null;
    static Statement statement;
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(CONNECTION_URL);
            statement = connection.createStatement();
//            statement.execute(CREATE_TABLE_QUERY);

//            statement.execute(INSERT_INTO_TABLE_QUERY);

//            statement.execute(UPDATE_TABLE_QUERY);

//            statement.execute(DELETE_RECORD_QUERY);
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_CONTACTS);
            while (resultSet.next()){
                System.out.println(resultSet.getString(NAME_COLUMN) + " " +
                                    resultSet.getInt(PHONE_COLUMN) + " " +
                                    resultSet.getString(EMAIL_COLUMN));
            }

            resultSet.close();

        }catch (SQLException ex){
            System.out.println("Something went wrong with the connection to JDBC" + ex.getMessage());
        }finally{
            try{
                if(statement != null){
                    statement.close();
                }
                if(connection != null){
                    connection.close();
                }
            }catch (SQLException exception){
                System.out.println("Something went wrong when trying to close database. "+ exception.getMessage());
            }
        }
    }

    public static void insertRecord(Statement statement, String name, int phone, String email) throws SQLException{
        statement.execute("INSERT INTO "+
                CONTACTS_TABLE + " ("+
                NAME_COLUMN +", "+
                PHONE_COLUMN+", "+
                EMAIL_COLUMN +") " +
                "VALUES ( "+ name + ","+ phone+","+ email +")");
    }

    public static void createTable(Statement statement, String name, String phone, String email)throws SQLException {
        statement.execute("CREATE TABLE " + CONTACTS_TABLE + "("
                + name + " TEXT, " + phone + " INTEGER, "+ email + " TEXT )" );
    }

    public static void updateEmail(Statement statement, String name,String newEmail, String email) throws SQLException{
        statement.execute("UPDATE "+
                CONTACTS_TABLE+ " SET "+
                email+ " = '"+ newEmail+"' WHERE"+
                name+ "='Flash'");
    }

    public static void updatePhone(Statement statement, String name,int newPhone, String email) throws SQLException{
        statement.execute("UPDATE "+
                CONTACTS_TABLE+ " SET "+
                email+ " = '"+ newPhone+"' WHERE"+
                name+ "='Flash'");
    }

    public static void updateName(Statement statement, String name,String newName, String email) throws SQLException{
        statement.execute("UPDATE "+
                CONTACTS_TABLE+ " SET "+
                email+ " = '"+ newName+"' WHERE"+
                name+ "='Flash'");
    }

    public static void deleteRecord(Statement statement, String columnName, String rowIdentifier)throws SQLException{
        statement.execute("DELETE FROM " +
                CONTACTS_TABLE+" WHERE "+
                columnName+ " = '"+ rowIdentifier+"'");
    }

    public static void dropTable(Statement statement, String tableName)throws SQLException{
        statement.execute("DROP TABLE IF EXISTS " + tableName);
    }





}
