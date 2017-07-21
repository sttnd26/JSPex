<%--
  Created by IntelliJ IDEA.
  User: Lenovo-1
  Date: 13-07-2017
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignIn</title>
</head>
<body>
<%
    if(session.getAttribute("name")==null){
%>

<form action="/signin" method="post">
    <table>
        <tr>
            <td>Name :</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Password : </td>
            <td><input type="password" name="pswd"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit"></td>
        </tr>
    </table>
</form>
<%
    }
    else
    response.sendRedirect("welcome.jsp");
%>
</body>
</html>
