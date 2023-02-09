import java.sql.*;
public class QuesSix 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "parihar5050**#";
        
        String query = "select count(*) from new_meet where ScheduledDate = '2022-01-19'";
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(query);
        
        rs.next();
    
        System.out.println("Participant Meeting on Tuesday" + " " + rs.getInt(1));
        
        st.close(); 
        con.close();  
    }        
}
