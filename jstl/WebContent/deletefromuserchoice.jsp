
<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
 
<html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
 
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
    url="jdbc:mysql://localhost/cts"  
    user="root"  password="root"/>  
 
<sql:update dataSource="${db}" var="count">
insert into students values('ctsjava4','jhnavi','ece','cts');

</sql:update>
<c:set var="StudentId" value="<%=request.getParameter(\"id\") %>"/>
<sql:update dataSource="${db}" var="ct">
DELETE FROM students where htno=?
<sql:param value="${StudentId }"/>
</sql:update>
 <sql:query dataSource="${db}" var="rs">  
SELECT * from students;  
</sql:query> 

<table border="2" width="100%">  
<tr>  
<th>HallTicket No</th>  
<th>Name</th>  
<th>Branch</th>  
<th>Clg Code</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.htno}"/></td>  
<td><c:out value="${table.name}"/></td>  
<td><c:out value="${table.branch}"/></td>  
<td><c:out value="${table.ccode}"/></td>  
</tr>  
</c:forEach>  
</table>  
 
</body>  
</html>  