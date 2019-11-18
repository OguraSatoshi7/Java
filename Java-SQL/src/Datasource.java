import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Datasource {
    private Connection conn;
    private String connectionString = "jdbc:sqlite:/Users/satoshi.ogura/Desktop/SQL/database/music.db";

    public boolean open(){
        try{
            conn = DriverManager.getConnection(connectionString);
            return true;
        } catch (SQLException e ){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Artist> queryForArtists(){

        List<Artist> artists = new ArrayList<Artist>();
        try {
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM artists");

            ResultSet rs = statement.getResultSet();

            while(rs.next()){
                artists.add(new Artist(rs.getInt("_id"),
                        rs.getString("name")));
            }
            return artists;

        } catch (SQLException e ){
            System.out.println(e.getMessage());
            return null;

        }
    }

}
