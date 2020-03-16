
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"  import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("uname");
String pwd=request.getParameter("pwd");
int flag=0;
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
Statement statement=connection.createStatement();
String query="select * from users";
ResultSet rs=statement.executeQuery(query);
while(rs.next())
{
	String uname = rs.getString(2);
	String password = rs.getString(3);
	if((name.equals("admin"))&&(pwd.equals("admin")))
	{
		flag=1;
		break;
	}
	else if((name.equals(uname))&&(pwd.equals(password)))
	{
 	 flag=2;
	  break;
	}
}
if(flag==1)
{	
}
else if(flag==2)
{
	%>
	<jsp:include page="associate.html"/>
	<%	
}
else
{
	out.println("<h3>UnAuthorised Users");
	out.println("<br>Please Re-Login</h3>");
	%>
	<jsp:include page="login.html"/>
	<%
}
statement.close();
connection.close();
%>
</body>
</html>