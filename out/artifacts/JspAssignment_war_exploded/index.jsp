<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo-1
  Date: 13-07-2017
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ques1</title>
  </head>
  <body>
  <%
    Date date=new Date();
    out.print("Hello the time is now : ");
  %>
  <% out.print("<p>"+date+"</p>");%>
  </body>
</html>
