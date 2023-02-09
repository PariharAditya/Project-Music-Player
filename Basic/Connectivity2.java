//🕉️
/*fetching the data from table*/
import java.sql.*;
public class Connectivity2 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
    String url = "jdbc:mysql://localhost:3306/demo";
    String userName = "root";
    String password = "parihar5050**#";
    
    String query = "select * from students";
    // String query = "delete from demotable where sapID = 2";

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,userName,password);
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);

    // int rs =  st.executeUpdate(query);
    // System.out.println(rs);

    while (rs.next()) 
    {
        String userData = rs.getInt(1) + " " + rs.getString("name");    
        System.out.println(userData);    
    }    
    st.close(); 
    con.close();    
}    
}
