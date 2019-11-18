import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Main");
//        try {
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:sqlite:/Users/satoshi.ogura/Desktop/SQL/database/music.db"
//            );
//            Statement statement = conn.createStatement();
//            statement.execute("SELECT name FROM artists");
//            ResultSet results = statement.getResultSet();
//
//            while(results.next()){
//                System.out.println(results.getString("name"));
//            }
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        System.out.println("------------------------------------------------");


        Datasource ds = new Datasource();

        List<Artist> artistList = new ArrayList<Artist>();
        if(ds.open()){
            artistList = ds.queryForArtists();
            System.out.println("connected to db");
        } else {
            System.out.println("not connected to db");
        }

        System.out.println("Artists in my database");

        for(Artist i : artistList){
            System.out.println(i.getId()+" >> "+ i.getName());
        }



    }
}
