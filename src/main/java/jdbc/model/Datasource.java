package jdbc.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Datasource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_URL = "/Users/user/Downloads/" + DB_NAME;

    public static final String ALBUMS_TABLE = "albums";
    public static final String ALBUM_ID_COLUMN = "_id";
    public static final String ALBUM_NAME_COLUMN = "name";
    public static final String ALBUM_ARTIST_COLUMN = "artist";
    public static final int INDEX_ALBUM_ID_COLUMN = 1;
    public static final int INDEX_ALBUM_NAME_COLUMN = 2;
    public static final int INDEX_ALBUM_ARTIST_COLUMN = 3;

    public static final String SONGS_TABLE = "songs";
    public static final String SONGS_ID_COLUMN = "_id";
    public static final String SONGS_TITLE_COLUMN = "title";
    public static final String SONGS_ALBUM_COLUMN = "album";
    public static final int INDEX_SONGS_ID_COLUMN = 1;
    public static final int INDEX_SONGS_TITLE_COLUMN = 2;
    public static final int INDEX_SONGS_ALBUM_COLUMN = 3;

    public static final String ARTISTS_TABLE = "artists";
    public static final String ARTISTS_ID_COLUMN = "_id";
    public static final String ARTISTS_NAME_COLUMN = "name";
    public static final int INDEX_ARTISTS_ID_COLUMN = 1;
    public static final int INDEX_ARTISTS_NAME_COLUMN = 2;

    Connection connection;
    Statement statement;

    public boolean openConnection() {

        try{
            Class.forName("org.sqlite.JDBC");
             connection = DriverManager.getConnection(CONNECTION_URL);
             return true;

        }catch (Exception ex){
            System.out.println("Could not connect to database. "+ ex.getMessage());
            return false;


        }
    }

    public void closeConnection(){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException ex){
            System.out.println("Could not close connection "+ex.getMessage());
        }
    }

    public List<Artist> getArtists(){
        List<Artist> artists = new ArrayList<>();
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + ARTISTS_TABLE)){
            while(resultSet.next()){
                Artist artist = new Artist();
                artist.setId(resultSet.getInt(INDEX_ARTISTS_ID_COLUMN));
                artist.setName(resultSet.getString(INDEX_ARTISTS_NAME_COLUMN));

                artists.add(artist);
            }

            return artists;

        }catch (SQLException ex){
            System.out.println("Something went wrong "+ ex.getMessage());
        }
        return null;
    }
}
