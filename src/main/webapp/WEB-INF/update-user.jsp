<%@ page import="com.softserve.itacademy.User" %><%--
  Created by IntelliJ IDEA.
  User: matse
  Date: 7/27/2023
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update user</title>
</head>
<body>
<form method="post">
    <%
        User user = (User) request.getAttribute("user");
    %>
    <table>
        <tr>
            <td>
                <label for="id">ID</label>
            </td>
            <td>
                <input type="text" id="id" name="id" value="<%=user.getId()%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for="username">Username:</label>
            </td>
            <td>
                <input type="text" id="username" name="username" value="<%=user.getUsername()%>">
            </td>
        </tr>
        <tr>
            <td>
                <label for="password">Pasword:</label>
            </td>
            <td>
                <input type="password" id="password" name="password" value="<%=user.getPassword()%>">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update">
            </td>
            <td>
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
