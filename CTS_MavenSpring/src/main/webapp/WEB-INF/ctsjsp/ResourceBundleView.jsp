<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<h2>${harshal}</h2>
<a id="en" href="/CTS_MavenSpring/useri18n_hello?lang=en">English</a>
<a id="fr" href="/CTS_MavenSpring/useri18n_hello?lang=fr">French</a>
<spring:message code="signmsg"/>