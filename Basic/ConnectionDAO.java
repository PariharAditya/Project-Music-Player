/*Har Har Mahadev🕉️*/
/* if we declare static block it will get executed*/
import java.sql.*;

class TableInfo 
{
 int idstudents;
 String name ;    
}

class ExecutingQuery 
{
 public TableInfo getStudent(int rollN) throws Exception
 {
    String query = "select name from students where idstudents="+rollN;

    TableInfo s = new TableInfo();
    s.idstudents = rollN;

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "parihar5050**#");
    Statement st = connect.createStatement();
    ResultSet rs = st.executeQuery(query);
    rs.next();

    String name = rs.getString(1);
    s.name = name;

    return s;
 }  
}

public class ConnectionDAO 
{
public static void main(String[] args) throws Exception 
{
  ExecutingQuery obj = new ExecutingQuery();
  TableInfo s1 = obj.getStudent(1);
  System.out.println(s1.name);
  
}    
}
