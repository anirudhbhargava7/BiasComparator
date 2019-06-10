<%--
  Created by IntelliJ IDEA.
  User: abhargava
  Date: 2019-06-08
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Comparison TIme</title>
</head>
<center>
<body>
<%
    if(request.getAttribute("Winner")==null){
%>
<h1>Choose your Favourite</h1>
<h2>They both are great in their own way, but whom do you like?</h2>
<h3>Hint : Answer depends on your Bias ;)</h3>
<h4>Matches left : ${comparisons}</h4>
<form method="post" action="/compare">
    <input type="hidden" name="type" value="${type}">
    <input type="submit" name="int_winner" value="${candidate1}">
    <input type="submit" name="int_winner" value="${candidate2}">
</form>

<br><br><br>


<%
    }
    else{
%>
<h3>Your Undisputed Champion among all ${type} is :</h3> <b>${Winner}</b>
<br><br>
<h3>Scorecard</h3>
<table>
    <tr>
        <td>${keys}</td>
    </tr>
</table>
${keys}<br><br>${values}
<a href="index.jsp"><h5>Start Again</h5></a>
<%
    }
%>
</center>
</body>
</html>
