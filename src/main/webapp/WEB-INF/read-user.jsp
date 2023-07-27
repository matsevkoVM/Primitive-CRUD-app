<%@ page import="com.softserve.itacademy.User" %><%--
  Created by IntelliJ IDEA.
  User: matse
  Date: 7/27/2023
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show info about user</title>
</head>
<body>
<%@include file="header.html" %>
<br><br>
<%
    User user = (User) request.getAttribute("user");
%>
<p>ID: <%=user.getId()%>
</p>
<p>Username: <%=user.getUsername()%>
</p>
<p>Password: <%=user.getPassword()%>
</p>
<p>
    <a href="/users/update?id=<%=user.getId()%>">Update</a> <a href="/users/delete?id=<%=user.getId()%>">Delete</a>
</p>
</body>
</html>
