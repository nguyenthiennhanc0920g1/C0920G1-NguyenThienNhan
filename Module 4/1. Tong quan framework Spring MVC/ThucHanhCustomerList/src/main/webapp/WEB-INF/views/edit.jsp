<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/1/2021
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <title>Edit</title>
</head>
<body>
<div class="container">
    <h2>Chỉnh sửa thông tin</h2>
    <form action="/edit" method="POST">
        <c:if test="${customer != null}">
            <table class="table table-bordered table-hover table-sm">
                <input name="id" type="hidden" value="${customer.id}">
                <tr>
                    <th>ID</th>
                    <td><c:out value="${customer.id}"/></td>
                </tr>
                <tr>
                    <th>NAME</th>
                    <td><input name=name value="<c:out value="${customer.id}"/>"/></td>
                </tr>
                <tr>
                    <th>EMAIL</th>
                    <td><input name=email value="<c:out value="${customer.email}"/>"/></td>
                </tr>
                <tr>
                    <th>ADDRESS</th>
                    <td><input name=name address="<c:out value="${customer.address}"/>"/></td>
                </tr>
            </table>
        </c:if>
        <button type="submit" class="btn btn-primary">YES</button>
        <a href="/list" class="btn btn-danger btn-sm" role="button">CANCEL</a>
    </form>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</body>
</html>
