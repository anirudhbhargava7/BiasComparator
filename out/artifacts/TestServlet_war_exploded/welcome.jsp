<%--
  Created by IntelliJ IDEA.
  User: abhargava
  Date: 2019-06-08
  Time: 03:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Petty Comparisons</title>
</head>
<body>
<center>
<h1>Welcome ${username} </h1>

<form method="get" action="/compare">
    <br>
    <select name="type" size="1">
        <option>SINGERS</option>
        <option>ACTORS</option>
        <option>CITIES</option>
    </select>
    <br><br>
    <input type="submit" value="Start">
</form>
</center>
</body>
</html>
