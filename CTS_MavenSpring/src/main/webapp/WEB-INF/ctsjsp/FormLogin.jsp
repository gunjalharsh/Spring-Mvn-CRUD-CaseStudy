<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgrey">

<h1>
<form:form action="valid" modelAttribute="result">
Name:
<form:input path="name"/><br>
Hobbies:
Shopping<form:checkbox path="f_hobbies" value="Shopping"/>
Cricket<form:checkbox path="f_hobbies" value="Cricket"/>
SocialMedia<form:checkbox path="f_hobbies" value="Whatsapp,Google"/>
<br><br>

Gender:
Male<form:radiobutton path="gender" value="Male"/>
Female<form:radiobutton path="gender" value="Female"/>
<br><br>
Country:
<form:select path="country" items="${countryopt }" multiple="true" value="Country"/>

<input type="submit" value="Submit"/>

</form:form>
</h1>

</body>
</html>