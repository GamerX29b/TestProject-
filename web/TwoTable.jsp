<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.11.2018
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import = "javax.servlet.http.*,javax.servlet.*,oracle.jdbc.driver.*" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

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

    if ((cookie.getName()).equals("Name")){
    out.print("Hello " + cookie.getValue());
    }
    }
    }else{
    out.println("<h2>нет Cookie</h2>");
    }
%>
</head>
<body>


    <jsp:useBean id="SpringJDB" class="spring.SpringJDB" scope="session">
        results
    </jsp:useBean>
    <sql:query dataSource = "${dataSource}" sql = "select * from all_tables" var = "result">

    </sql:query>


<table border = "1" width = "100%">
    <tr>
        <th>Emp ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Patronymic</th>
    </tr>

    <c:forEach var = "row" items = "${result.rows}">
        <tr>
            <td> <c:out value = "${row.owner}"/></td>
            <td> <c:out value = "${row.table_name}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
