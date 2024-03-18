<%@ page import="logic.somePackage.Cart" %><%--
  Created by IntelliJ IDEA.
  User: serge
  Date: 18.03.2024
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@ page import="logic.somePackage.Cart" %>

<% Cart cart = (Cart) session.getAttribute("cart"); %>
<p>
    Наименование:
    <%=cart.getName()%>
</p>
<p>
    Количество:
    <%=cart.getQuantity()%>
</p>


</body>
</html>
