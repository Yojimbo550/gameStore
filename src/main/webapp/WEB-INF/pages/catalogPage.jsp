<%--
  Created by IntelliJ IDEA.
  User: alexy
  Date: 07.12.2021
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table table-dark">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">productName</th>
        <th scope="col">category</th>
        <th scope="col">weight</th>
        <th scope="col">cost</th>
        <th scope="col">quantity</th>

    </tr>
    </thead>
    <
    <c:forEach var="productEntity" items="${productEntity}">
        <tr>
            <td>${productEntity.id}</td>
            <td>${productEntity.productName}</td>
            <td>${productEntity.category}</td>
            <td>${productEntity.weigth}</td>
            <td>${productEntity.cost}</td>
            <td>${productEntity.quantity}</td>

            <td>
                <a href="/edit/${productEntity.id}">edit</a>
                <a href="/delete/${productEntity.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
