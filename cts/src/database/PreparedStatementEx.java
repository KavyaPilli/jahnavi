package database;
import java.util.*;
import java.sql.*;
public class PreparedStatementEx {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
  try {
	  DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	  Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
	  Statement statement=connection.createStatement();
	  String query="insert into customer values(?,?,?)";
      PreparedStatement pst=connection.prepareStatement(query);
      Scanner sc=new Scanner(System.in);
  	System.out.println("enter customer id");
  	String id=sc.nextLine();
  	System.out.println("enter customer name");
  	String name=sc.nextLine();
  	System.out.println("enter customer ctype");
  	String ctype=sc.nextLine();
  	pst.setString(1, id);
  	pst.setString(2, name);
  	pst.setString(3, ctype);
  	int x=pst.executeUpdate();
  	System.out.println(x+" Record inserted");
  	}
catch(SQLException e)
  {
   System.out.println(e);
  }
  }
	}


