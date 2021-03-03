<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 29/12/2020
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Benh An</h2></caption>
        <tr>
            <th>MA BENH AN</th>
            <th>MA BENH NHAN</th>
            <th>TEN BENH NHAN</th>
            <th>NGAY NHAP VIEN</th>
            <th>NGAY RA VIEN</th>
            <th>LY DO NHAP VIEN</th>
            <th>PHUONG PHAP DIEU TRI</th>
            <th>BAC SI DIEU TRI</th>
        </tr>
        <c:forEach var="benhAn" items="${listBenhAn}">
            <tr>
                <td><c:out value="${benhAn.maBenhAn}"/></td>
                <td><c:out value="${benhAn.maBenhNhan}"/></td>
                <td><c:out value="${benhAn.tenBenhNhan}"/></td>
                <td><c:out value="${benhAn.ngayNhapVien}"/></td>
                <td><c:out value="${benhAn.ngayRaVien}"/></td>
                <td><c:out value="${benhAn.lyDoNhapVien}"/></td>
                <td><c:out value="${benhAn.phuongPhapDieuTri}"/></td>
                <td>
                    <a href="/benhan?action=edit&id=${benhAn.maBenhAn}">Edit</a>
                    <a href="/benhan?action=delete&id=${benhAn.maBenhAn}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
