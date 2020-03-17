package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {
public static void main(String args[])throws ClassNotFoundException,SQLException
{
//Class.forName("com.mysql.cj.jdbc.Driver");
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement statement=connection.createStatement();
String query="create table student(id integer(10),name varchar(25))";
int count=statement.executeUpdate(query);
System.out.println(count+" table created");
statement.close();
connection.close();
}
}
