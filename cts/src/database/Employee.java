package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			  DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			  //establishing connection with driver manager
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
			//creating  a statement
				Statement st=con.createStatement();
				String qury="insert into employee values(?,?,?,?,?,?)";
				//creating prepared statement to execute user defined values
				PreparedStatement ps=con.prepareStatement(qury);
				Scanner sc=new Scanner(System.in);
				//reading values from the users
				System.out.println("Enter Employee name");
				String ename=sc.next();
				System.out.println("Enter Employee id");
				String eid=sc.next();
				System.out.println("Enter Employee department");
				String edept=sc.next();
				System.out.println("Enter Employee designation");
	    		String edesig=sc.next();
	    		System.out.println("Enter Employee company");
	    		String ecomp=sc.next();
	    		System.out.println("Enter Employee email");
	    		String email=sc.next();
	    	 	ps.setString(1,ename);
	    	  	ps.setString(2,eid);
	    	  	ps.setString(3,edept);
	    	 	ps.setString(4,edesig);
	    	  	ps.setString(5,ecomp);
	    	  	ps.setString(6,email);
	    		//executing the query using prepared statement
	    		int result=ps.executeUpdate();
	    		//displaying the results
	    		System.out.println(result+" Record inserted");
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}
}
