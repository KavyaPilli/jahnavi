

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" import="java.util.*,data.Employ"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
<tr>
<th>Empid</th>
<th>Ename</th>
<th>Dept</th>
<th>Desg</th>
<th>Email</th>
</tr>
<%
Employ emp=(Employ)request.getAttribute("emp");
%>
<c:set var="list1" value="${emp}"/>

<tr>
<td>${emp.getEmpid()}</td>
<td>${emp.getEname()}</td>
<td>${emp.getDept()}</td>
<td>${emp.getDesig()}</td>
<td>${emp.getEmail()}</td>
</tr>
</table>
</body>
</html>