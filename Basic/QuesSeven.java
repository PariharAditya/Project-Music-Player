import java.sql.*;
import java.util.Scanner;
public class QuesSeven 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "parihar5050**#";
        
        Scanner io = new Scanner(System.in);
        String Date = io.next();    

                                                                                        //Fxn calling                     
        String query = "select participant from new_meet where ParticipantDOB = "+ "'" +dateOfBirth(Date)+"'" ;
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(query);
        
        while (rs.next()) 
        {
         System.out.println(rs.getString("participant"));   
        }
        st.close(); 
        con.close();

        io.close(); 
    }  
    // Fxn taking Input
    static String dateOfBirth(String date) 
    {
        return date;
    }          
}
