<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.11.2018
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Plugin tester</title>
</head>

<body>
<h1>Приветсвтие пользователя</h1>
<form action = "servlet0" method = "POST">
    <table border = "0">

        <tr>
            <td><b>Назовите имя </b></td>
            <td><input type = "text" name = "parametr0"
                       value = "two" size = "70"/></td>
        </tr>

        <tr>
            <td colspan = "2"><input type = "submit" value = "Поприветствовать"/></td>
        </tr>
    </table>
</form>
</body>
</html>
