<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>PROBANDO</title>
    </head>
<body>
    <h1>Hello World</h1>

    <h4>Hi, I am
        <c:out value="${name}"/>
        <c:out value="${last}"/>
       my email is: <c:out value="${email}"/>
        <c:out value="${age}"/>
    </h4>    
</body>
</html>
