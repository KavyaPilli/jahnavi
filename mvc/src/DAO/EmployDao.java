package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.Employ;
public class EmployDao {
public static Connection getConnection() throws ClassNotFoundException, SQLException
{
	Connection con=null;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return con;
}
public int insertEmploy(Employ emp)
{ 
	int result=0;
	try
	{
	Connection con=getConnection();
	String query="insert into employ values(?,?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,emp.getEmpid());
	pst.setString(2,emp.getEname());
	pst.setString(3,emp.getDept());
	pst.setString(4,emp.getDesig());
	pst.setString(5,emp.getEmail());
	result=pst.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return result;
	
}
public List<Employ> ShowEmploy()
{
	List<Employ> list=new ArrayList<Employ>();
	try
	{
		Connection con=getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employ");
		while(rs.next())
		{
			Employ em=new Employ();
			em.setEmpid(rs.getString(1));
			em.setEname(rs.getString(2));
			em.setDept(rs.getString(3));
			em.setDesig(rs.getString(4));
			em.setEmail(rs.getString(5));
			list.add(em);
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}
public Employ searchEmploy(String empid)
{
	Employ ee=new Employ();
	try
	{
		Connection con=getConnection();
		String sql="select * from employ where empid=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,empid);
		ResultSet rs=pst.executeQuery();
		rs.next();
		ee.setEmpid(rs.getString(1));
		ee.setEname(rs.getString(2));
		ee.setDept(rs.getString(3));
		ee.setDesig(rs.getString(4));
		ee.setEmail(rs.getString(5));
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return ee;
}
}
