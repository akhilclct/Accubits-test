<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<<!DOCTYPE html>>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="save" method="post">
<table border="2">
<tr>
<td colspan="2" align="center"><b>Blog registration form form</b></td>
</tr>
<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" /></td>
</tr>
<tr>
<td><label>email</label></td>
<td><input type="email" name="email" /></td>
</tr>
<tr>
<td><label>password</label></td>
<td>
<input type="text" name="password"></textarea></td>
</tr>
<input type="submit" value="Register" name="reg">
<button type="reset">Cancel</button>
</table>
</form>
</body>
</html>

