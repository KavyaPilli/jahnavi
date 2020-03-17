
package database;
import java.sql.*;
import java.util.Scanner;
public class UserDataRetriving {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id no");
		int id=sc.nextInt();
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		  Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		  Statement statement=connection.createStatement();
		  String query="select * from student where id="+id;
	      PreparedStatement pst=connection.prepareStatement(query);
	      ResultSet rs=statement.executeQuery(query);
	   	  if(rs.next())
	   	  {
	        
	  		System.out.println("id :"+rs.getInt(1));
	  		System.out.println("name: "+rs.getString(2));
	   	  }
	   	  else
	   	  {
	   		  System.out.println("Enter valid id");
	   	  }
	}

}
