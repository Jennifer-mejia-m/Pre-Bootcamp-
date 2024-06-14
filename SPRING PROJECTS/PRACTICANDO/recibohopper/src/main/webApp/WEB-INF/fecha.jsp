<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <p><c:out value="${fecha}"/></p>
    <p><fmt:parseData value="${fecha}" pattern="dd-MM-yyyy"/></p>

</head>
<body>
    
</body>
</html>    