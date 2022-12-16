<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create New Lead</h2>
<form action="updateLead" method="post">
<table>
<tr>
	<td>
	<input type="hidden" name="id" value="${lead.id}"/>
	</td>
	</tr>
	<tr>
	<td>FirstName</td>
	<td><input type="text" name="firstName" value="${lead.firstName}"/>
	</tr>
	<tr>
	<td>LastName</td>
	<td><input type="text" name="lastName" value="${lead.lastName}"/>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="text" name="email" value="${lead.email}"/>
	</tr>
	<tr>
	<td>Mobile</td>
	<td><input type="text" name="mobile" value="${lead.mobile}"/>
	</tr>
</table>
	<input type="submit" value="update"/>
</form>
${msg}
</body>
</html>