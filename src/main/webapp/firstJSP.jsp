<%--
  Created by IntelliJ IDEA.
  User:
  Date: 12.03.2024
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>
    <%
        for (int i = 0; i < 10; i++) {
            System.out.println("<p>" + "Hello : " + i + "</p>");
        }
    %>
</p>
<p>
    <%
        String name = request.getParameter("name");
    %>

    <%= "Hello, " + name %>

    <%
        java.util.Date now = new java.util.Date();
        String someString = "Текущая дата: " + now;

    %>

    <%= someString %>
    <%= "Hello world" %>
    <%= new java.util.Date() %>
    <%@page import="java.util.Date, logic.TestClass" %>
    <%TestClass testClass = new TestClass(); %>
    <%=testClass.getInfo()%>

    <%
        new Date();
    %>
</p>
</body>
</html>
