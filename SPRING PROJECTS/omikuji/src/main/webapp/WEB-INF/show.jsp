<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Send an Omikuji</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Here's Your Omikuji</h1>
    <div class="contenedor">
        In ${number} years, you will live in ${city} with ${person} as your roomate, ${hobby} for a living.
        The next time you see ${living}, you will have a good luck. Also, ${sthnice}
    </div>

    <div>
        <a href="/omikuji">Go Back</a> 
    </div>
</body>
</html>