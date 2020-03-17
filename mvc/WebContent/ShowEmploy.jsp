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
Employee Information
<table border="1" width="90%">
<tr><th>EmpId</th><th>Name</th><th>Desig</th><th>Depart</th><th>Email</th></tr>
<%
List<Employ> list=(List<Employ>)request.getAttribute("emp");
%>
<c:set var="list1" value="${list}"></c:set>
<c:forEach items="${list1}" var="em">
<tr><td>${em.getEmpid()}</td><td>${em.getEname()}</td><td>${em.getDept()}</td><td>${em.getDesig()}</td><td>${em.getEmail()}</td>
</tr>
</c:forEach>
</table>
</body>
</html>