import java.sql.*;
import java.util.*;
public class QuesTwo 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "parihar5050**#";
        
        //Taking Input
        Scanner io = new Scanner(System.in);
        String MeetingID = io.next();                                                         

        String query = "select participant from new_meet where MeetingID = "+ "'" +MeetingID+"'" ;
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(query);
        
        while (rs.next()) 
        {
            // Printing Participant Name with ID
         System.out.println(rs.getString("participant")+" in the Meeting ="+ " "+MeetingID);   
        }
        st.close(); 
        con.close();
        io.close(); 
    }    
}
