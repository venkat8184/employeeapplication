<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enter employee details</title>
</head>
<body bgcolor="pink">
<h2>Enter Employee Details:</h2>
<form action="save" method="post">
<table><tr><td>Name:</td><td><input type="text" name="name"></td></tr>
       <tr><td>Email:</td><td><input type="email" name="email"></td></tr>
       <tr><td>Date format  yyyy-mm-dd</td></tr>
     <tr><td>  DateofBirth:</td><td><input type="text" name="dateOfBirth"></td></tr>
       <tr><td>Age:</td><td><input type="number" name="age"></td></tr>
       <tr><td>Salary:</td><td><input type="number" step="any" name="salary"></td></tr>
       <tr><td>status:</td></tr>
</table>
 <select name="status">
       <option value="ACTIVE">Active</option>
       <option value="INACTIVE">Inactive</option>
       </select><br>
<input style="color:green:" type="submit" value="save">
</form>
${msg}
</body>
</html>