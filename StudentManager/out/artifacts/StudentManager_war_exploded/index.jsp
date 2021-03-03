<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 25/12/2020
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>QLSV</title>
</head>
<body>
<div align="center">
    <h1>Danh sach sinh vien</h1>
    <table class="table" border="1" cellpadding="5">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>BIRTHDAY</th>
            <th>EMAIL</th>
            <th>ADDRESS</th>
        </tr>
        <c:forEach var="student" items="${list}">
            <tr>
                <td><c:out value="${student.getName()}"/></td>
<%--                <td><c:out value="${customer.id_type_customer}"/></td>--%>
<%--                <td><c:out value="${customer.full_name_customer}"/></td>--%>
<%--                <td><c:out value="${customer.birthday_customer}"/></td>--%>
<%--                <td><c:out value="${customer.id_card_customer}"/></td>--%>
                <td>
                    <button type="button" class="btn btn-secondary">
                        <a href="/student?action=edit&id=${student.getId()}">Edit</a>
                    </button>
                </td>
            </tr>
        </c:forEach>
        </thead>
    </table>
    <button type="button" class="btn btn-default">
        <a href="http://localhost:8085/customer/create.jsp">Add new student</a>
    </button>
</div>
</div>
</body>
</html>
