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
                       value = "Zero" size = "70"/></td>
        </tr>
        <tr>
            <td><b>Назовите фамилию </b></td>
            <td><input type = "text" name = "parametr1"
                       value = "one" size = "70"/></td>
        </tr>
        <tr>
            <td><b>Назовите отчество </b></td>
            <td><input type = "text" name = "parametr2"
                       value = "two" size = "70"/></td>
        </tr>

        <tr>
            <td colspan = "2"><input type = "submit" value = "Поприветствовать"/></td>
        </tr>
        <tr>

        </tr>
    </table>
</form>

<%
    Cookie cookie = null;
    Cookie[] cookies = null;

    cookies = request.getCookies();
    if( cookies != null ){
        out.println("<h2> содержимое Cookie </h2>");
        for (int i = 0; i < cookies.length; i++){
            cookie = cookies[i];

           if ((cookie.getName()).equals("name")){
                out.print("Я знаю тебя как " + cookie.getValue());
            }
        }
    }else{
        out.println("<h2>нет Cookie</h2>");
    }
%>

<a href="TwoTable.jsp">Да, это я.</a>
</body>
</html>
