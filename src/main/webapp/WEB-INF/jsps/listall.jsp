<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of employees</title>
</head>
<body>
<table border="1">
<tr><th>Name</th>
<th>Email</th>
<th>DateofBirth</th>
<th>Age</th>
<th>Salary</th>
<th>Status</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach var="emp" items="${employees}">
<tr>
<td>${emp.name}</td>
<td>${emp.email}</td>
<td>${emp.dateOfBirth}</td>
<td>${emp.age}</td>
<td>${emp.salary}</td>
<td>${emp.status}</td>
<td><a href="deleteById?id=${emp.id}">delete</a></td>
<td><a href="updateById?id=${emp.id}">update</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>