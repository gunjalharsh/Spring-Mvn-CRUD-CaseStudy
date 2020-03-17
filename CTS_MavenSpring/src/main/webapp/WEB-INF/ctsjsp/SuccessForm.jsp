<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgrey">



Name:${result12.name}
<br>
Hobbies:
<ul>
<c:forEach var="hoblist" items="${result12.f_hobbies}">
<li>${hoblist}</li>
</c:forEach>
</ul>
<br>
Gender:${result12.gender}<br>
Country:${result12.country}<br>

</h1>


</body>
</html>