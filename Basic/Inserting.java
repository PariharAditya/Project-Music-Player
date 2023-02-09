/*Har Har Mahadev 🕉️*/
/*inserting data in table executeUpdate will be used ⚠️(" var + ",'" + name + "')"*" ' this is important' " */ 
import java.sql.*;

public class Inserting 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
    String url = "jdbc:mysql://localhost:3306/demo";
    String userName = "root";
    String password = "parihar5050**#";

    int idstudents = 6;
    String name = " Glory to Hanuman";
    
    // String query = "insert into students values (4,'Success')";
    
    /*variable*/
    String query = "insert into students values (" + idstudents + ",'" + name + "')";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,userName,password);
    Statement st = con.createStatement();
    int rs =  st.executeUpdate(query);

    System.out.println(rs + " row affected");
        
    st.close(); 
    con.close();    
}     

      
    
}
