<%--
  Created by IntelliJ IDEA.
  User: Lenovo-1
  Date: 13-07-2017
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%if(session.getAttribute("name")!=null){%>
<p>Welcome <%= session.getAttribute("name")%>!</p>
<p>Your email is <%=request.getAttribute("email")%>.</p>
<form action="/logout" method="post">
    <input type="submit" value="Logout">
</form>
<% }else {
    response.sendRedirect("signin.jsp");
}%>
</body>
</html>
