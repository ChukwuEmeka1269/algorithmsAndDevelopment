package jdbc.model;

import java.util.List;

public class ProcessDB {
    public static void main(String[] args){
        Datasource datasource = new Datasource();



        if(!datasource.openConnection()){
            System.out.println("Could not open datasource");
            return;
        }

        List<Artist> artists = datasource.getArtists();
        if(artists == null){
            System.out.println("No artist found. Record might be empty");
            return;
        }

        artists.forEach(artist -> System.out.println(artist.getId() + " | " + artist.getName()));





        datasource.closeConnection();

    }
}
