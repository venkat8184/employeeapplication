<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update employee</title>
</head>
<body>
<h2>Update Employee Details</h2>
<form action="update" method="post">
<input type="hidden" name="id" value="${employee.id}">
<table>
<tr><td>Name:</td><td><input type="text" name="name" value="${employee.name}"></td></tr>
<tr><td>DateOfBirth:</td><td><input type="text" name="dateOfBirth" value="${employee.dateOfBirth}"></td></tr>
<tr><td>Age:</td><td><input type="number" name="age" value="${employee.age}"></td></tr>
<tr><td>Email:</td><td><input type="email" name="email" value="${employee.email}"></td></tr>
<tr><td>Salary:</td><td><input type="number" step="any" name="salary" value="${employee.salary}"></td></tr>
</table>
Status:
<select name="status">
       <option value="ACTIVE">Active</option>
       <option value="INACTIVE">Inactive</option>
       </select><br>

<input type="submit" value="update">

</form>
</body>
</html>