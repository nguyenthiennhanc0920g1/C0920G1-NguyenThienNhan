<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <title>List</title>
</head>
<body>
<div class="container">
    <form action="/list" method="GET">
        <h2 style="text-align: center">DANH SÁCH CUSTOMERS</h2>
        <table class="table table-bordered table-hover table-sm">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>EMAIL</th>
                <th>ADDRESS</th>
            </tr>
            <c:forEach var="customer" items="${customerList}">
                <tr>
                    <td scope="row"><c:out value="${customer.id}"/></td>
                    <td><c:out value="${customer.name}"/></td>
                    <td><c:out value="${customer.email}"/></td>
                    <td><c:out value="${customer.address}"/></td>
                    <td>
                        <a href="/showCustomerByID/${customer.id}"
                           class="btn btn-primary btn-sm" role="button">EDIT</a>
                        <a href="/delete/${customer.id}"
                           class="btn btn-danger btn-sm" role="button">DELETE</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</body>
</html>
