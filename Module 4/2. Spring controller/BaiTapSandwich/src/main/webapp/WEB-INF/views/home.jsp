<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/1/2021
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/save" method="POST">
    <input type="checkbox" name="giavi" value="Cà Chua">Cà Chua
    <input type="checkbox" name="giavi" value="Tiêu Xanh">Tiêu Xanh
    <input type="checkbox" name="giavi" value="Xà Lách">Xà Lách
    <input type="checkbox" name="giavi" value="Thịt Nguội">Thịt Nguội
    <input type="checkbox" name="giavi" value="Phô mai">Phô mai<br><br>
    <button type="submit" >SAVE</button>
</form>
</body>
</html>