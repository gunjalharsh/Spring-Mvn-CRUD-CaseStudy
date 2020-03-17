<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgrey">
<h1>
<u1>

<c:forEach var="listvalue" items="${lists }">
		<li>${listvalue }</li>
</c:forEach>
</u1>

</h1>

</body>
</html>