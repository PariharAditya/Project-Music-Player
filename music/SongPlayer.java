import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

/*package Player Where Music Plays*/
import MusicController.*;

import javazoom.jl.decoder.JavaLayerException;
public class SongPlayer 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, JavaLayerException 
{
    System.out.println("Available Playlist BackGround Music & General Songs\nType sound for BackGround or song for General Songs");
Scanner io = new Scanner(System.in);
String selector = io.next();


  Class.forName("com.mysql.cj.jdbc.Driver");
  
  String query = "select * from "+ selector;  
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mpthree", "root", "parihar5050**#");
  Statement st = conn.createStatement();
  ResultSet rs = st.executeQuery(query);

  while(rs.next()) 
  {
    String userData = rs.getString("name");    
    System.out.println(userData);
  
    if (selector.equals("sound") && userData.endsWith("mp3")) 
    {
      Player.sPlayer(userData);
    }
    if(selector.equals("song") && userData.endsWith("mp3")) 
    {
      Player.sPlayer(userData);
    }   
  }
  st.close();
  conn.close();    
  io.close();
}
}
