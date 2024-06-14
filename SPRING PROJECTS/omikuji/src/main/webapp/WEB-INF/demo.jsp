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
    <h1>Send an Omikuji</h1>
    <form action="/login" method="post">
    <div class="container1">
        <div>
            <label>Pick any number from 5 to 25</label>
            <p><input type="number" name="number"></p>
        </div>
        <div>
            <label>Enter the name of any city</label>
            <p><input type="text" name="city"></p>
        </div>
        <div>
            <label>Enter the name of any real person</label>
            <p><input type="text" name="person"></p>
        </div>
        <div>    
            <label> Enter professional endeavor or hobby</label>
            <p><input type="text" name="hobby"></p>
        </div>
        <div>
            <label> Enter any type of living thing</label>
            <p><input type="text" name="living"></p>
        </div>
        <div>    
            <label> Say something nice to someone</label>
            <p><textarea name="sthnice"></textarea></p> 
        </div>    
            <label> Send and show a friend</label>
        <div>
            <input type="submit" value="Send"></button>
        </div> 
    </div>
    </form>
</body>
</html>