package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
public static void main(String args[])throws ClassNotFoundException,SQLException
{
Class.forName("com.mysql.cj.jdbc.Driver");
//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement statement=connection.createStatement();
String query="insert into customer values('14','anuja','platinum')";
/*int count=statement.executeUpdate(query);
//System.out.println(count+" record inserted");*/
boolean flag=statement.execute(query);
if(flag)
	System.out.println("ResultSet is returned");
else
	System.out.println("record inserted");
statement.close();
connection.close();
}
}
