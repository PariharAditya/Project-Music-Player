/*Har Har Mahadev 🕉️ */
import java.sql.*;

public class Connectivity 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
    String url = "jdbc:mysql://localhost:3306/demo";
    String userName = "root";
    String password = "parihar5050**#";
    // String query = "insert into employee values (7, 'parihar', 23, 'SDE')";
    String query = "select name from students where idstudents = 3";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,userName,password);
    Statement st = con.createStatement();
    ResultSet rs =  st.executeQuery(query);

    rs.next();
    String name = rs.getString("name");

    System.out.println(name);
    
    st.close(); 
    con.close();    
}
    
}