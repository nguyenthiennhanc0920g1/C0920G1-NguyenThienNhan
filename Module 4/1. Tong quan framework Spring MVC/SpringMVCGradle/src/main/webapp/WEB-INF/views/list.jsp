<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h1>DANH SÁCH HỒ SƠ BỆNH ÁN</h1>
<form action="/list" method="GET">
    <table border="1" class="table">
        <thead>
        <tr>
            <th>MÃ BỆNH ÁN</th>
            <th>MÃ BỆNH NHÂN</th>
            <th>TÊN BỆNH NHÂN</th>
            <th>NGÀY NHẬP VIỆN</th>
            <th>NGÀY RA VIỆN</th>
            <th>LÝ DO NHẬP VIỆN</th>
            <th>PHƯƠNG PHÁP ĐIỀU TRỊ</th>
            <th>BÁC SĨ ĐIỀU TRỊ</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="benhan" items="${benhAnList}">
            <tr>
                <td><c:out value="${benhan.maBenhAn}"/></td>
                <td><c:out value="${benhan.maBenhNhan}"/></td>
                <td><c:out value="${benhan.tenBenhNhan}"/></td>
                <td><c:out value="${benhan.ngayNhapVien}"/></td>
                <td><c:out value="${benhan.ngayRaVien}"/></td>
                <td><c:out value="${benhan.lyDoNhapVien}"/></td>
                <td><c:out value="${benhan.phuongPhapDieuTri}"/></td>
                <td><c:out value="${benhan.bacSiDieuTri}"/></td>
                <td>
                    <a href="/benhAnChiTiet/${benhan.maBenhAn}">Edit</a>
                    <a href="/benhan?action=delete&id=${benhAn.maBenhAn}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>
