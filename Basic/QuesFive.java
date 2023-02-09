//🕉️
import java.sql.*;
public class QuesFive 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
    String url = "jdbc:mysql://localhost:3306/demo";
    String userName = "root";
    String password = "parihar5050**#";
    
    String query = "select count(*) from new_meet where MeetingID = 1105";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,userName,password);
    Statement st = con.createStatement();
    ResultSet rs =  st.executeQuery(query);
    
    rs.next();

    System.out.println(rs.getInt(1));
    
    st.close(); 
    con.close();  
}        
}    
