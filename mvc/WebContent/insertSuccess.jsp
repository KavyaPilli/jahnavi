<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,data.Employ"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Employ emp=(Employ)request.getAttribute("data");

%>
<b><h3>Record Inserted Successfully</h3></b>
Employee Information
<c:set var="emp" value="${emp}">
</c:set>
<table border="1" width="90%">
<tr><td>empid</td><td>ename</td><td>dept</td><td>desig</td><td>email</td></tr>
<tr><td>${emp.empid}</td><td>${emp.ename}</td><td>${emp.dept}</td><td>${emp.desig}</td><td>${emp.email}</td></tr>
</table>
</body>
</html>