<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.11.2018
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>



    <%
    Cookie cookie = null;
    Cookie[] cookies = null;

    cookies = request.getCookies();
    if( cookies != null ){
    out.println("<h2> Приветствие пользователя </h2>");
    for (int i = 0; i < cookies.length; i++){
    cookie = cookies[i];

    if ((cookie.getName()).equals("name")){
    out.print("Hello " + cookie.getValue());
    }
    }
    }else{
    out.println("<h2>нет Cookie</h2>");
    }
%>

</head>
<body>

</body>
</html>
