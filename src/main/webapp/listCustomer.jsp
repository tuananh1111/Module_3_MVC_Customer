<%--
  Created by IntelliJ IDEA.
  User: Pro 2004
  Date: 11/1/2020
  Time: 9:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<p><a href="/customer?action=create">Create new customer</a></p>
<div style="border: 1px solid black">
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Age</th>
            <th>Email</th>
        </tr>
        <tr>
            <c:forEach items='${requestScope["customers"]}' var="customer">
               <tr>
                <td>${customer.getId()}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getAddress()}</td>
                <td>${customer.getAge()}</td>
                <td>${customer.getEmail()}</td>
                <td><a href="/customer?action=edit&id=${customer.getId()}">Edit</a></td>
                <td><a href="/customer?action=delete&id=${customer.getId()}">Delete</a></td>
                 </tr>
            </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>
