<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>List of Leads</h2>
<table>
<tr>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>Delete</th>
	<th>update</th>
</tr>
<c:forEach var="lead" items="${leads}">
<tr>
	<td>${lead.firstName}</td>
	<td>${lead.lastName}</td>
	<td>${lead.email}</td>
	<td>${lead.mobile}</td>
	<td><a href="delete?id=${lead.id}">delete</a></td>
	<td><a href="update?id=${lead.id}">update</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>