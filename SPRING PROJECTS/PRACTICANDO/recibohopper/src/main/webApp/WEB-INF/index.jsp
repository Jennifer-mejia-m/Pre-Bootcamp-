<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recibo de Hopper</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
    <h1>Nombre cliente: <c:out value="${name}"/></h1>
    <h2>Nombre producto: <c:out value="${item}"/> </h2>
    <h2>Precio: <c:out value="${price}"/> </h2>
    <h2>Descripcion: <c:out value="${descr}"/> </h2>
    <h2>Vendedor: <c:out value="${vendor}"/> </h2>
</body>
</html>    