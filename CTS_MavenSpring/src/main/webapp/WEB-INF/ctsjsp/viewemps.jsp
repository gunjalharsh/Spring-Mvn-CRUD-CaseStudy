<%@ page language="java" isELIgnored="false"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgrey" text="red">
<h1>
Employee List

</h1>

<table border="3" width="20%">

<tr><th>Id</th><th>Name</th><th>Salary</th></tr>
<c:forEach var="emp11" items="${emplist }">
<tr>
<td>${emp11.eno }</td>
<td>${emp11.name }</td>
<td>${emp11.salary }</td>
</tr>
</c:forEach>


</table>

</body>
</html>