import java.sql.*;
public class Check 
{
public static void main(String[] args) throws ClassNotFoundException ,SQLException
{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    // String query1 = "update emp set salary = salary + (salary*0.1)";
    // String query1 = "insert into emp(salary, name) values(5000000,'Aditya')";

    String query = "select name from emp where salary = 6050000";
    String queryslt = "select * from emp";
     
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "parihar5050**#");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(queryslt);
    rs = stmt.executeQuery(query);

    System.out.println(rs.getString(1));    
    
    while (rs.next()) 
    {
    System.out.println(rs.getInt(1) +" "+rs.getString("name") );    
    }
    stmt.close();
    con.close();
}    
}
