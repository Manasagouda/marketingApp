<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create New Lead</h2>
<form action="saveLead" method="post">
<table>
	<tr>
	<td>FirstName</td>
	<td><input type="text" name="firstName"/>
	</tr>
	<tr>
	<td>LastName</td>
	<td><input type="text" name="lastName"/>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="text" name="email"/>
	</tr>
	<tr>
	<td>Mobile</td>
	<td><input type="text" name="mobile"/>
	</tr>
</table>
	<input type="submit" value="save"/>
</form>
${msg}
</body>
</html>