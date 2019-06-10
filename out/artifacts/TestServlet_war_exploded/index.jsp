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
    <title>Welcome Page</title>
  </head>
  <body>
<center>
  <h1>Welcome to Test Servlet</h1>
  <h2>Please login to Proceed:</h2>

  <form method="post" action="/login">
      Please Enter Your Name : <input type="text" name="username"/>
      <input type="submit" name="submit" value="submit"/>
  </form>
</center>
  </body>
</html>
