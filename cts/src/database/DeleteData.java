package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
public static void main(String args[])throws ClassNotFoundException,SQLException
{
//Class.forName("com.mysql.cj.jdbc.Driver");
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement statement=connection.createStatement();
String query="delete from customer where id='1004'";
int count=statement.executeUpdate(query);
System.out.println(count+" record deleted");
statement.close();
connection.close();
}
}
