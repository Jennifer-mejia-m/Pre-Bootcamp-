<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Fruity Loops</title>
</head>
<body>
    <div class="container">
        <h1>Tienda de frutas</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Precio</th>
                </tr>
            </thead>    
            <tbody>
                    <c:forEach var="producto" items="${fruta}">
                        <tr>
                            <td> ${producto.name} </td>
                            <td> <c:out value="${producto.price}"></c:out> </td>
                        </tr>   
                    </c:forEach>    
            </tbody>    
        </table>
    </div>
</body>
</html>