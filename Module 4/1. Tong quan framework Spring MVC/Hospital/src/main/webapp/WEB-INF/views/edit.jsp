<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/1/2021
  Time: 6:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <title>Edit</title>
</head>
<body>
<div class="container-fluid">
    <h2 style="text-align: center">CHỈNH SỬA THÔNG TIN</h2>
    <form action="/edit" method="POST">
        <c:if test="${hoSoBenhAn != null}">
            <input type="hidden" name = "maBenhNhan" value="<c:out value="${hoSoBenhAn.maBenhNhan}"/>"/>
            <table class="table">
                <tr>
                    <th>Mã bệnh án</th>
                    <td><c:out value="${hoSoBenhAn.maBenhAn}"/></td>
                </tr>
                <tr>
                    <th>Mã bệnh nhân</th>
                    <td><c:out value="${hoSoBenhAn.maBenhNhan}"/></td>
                </tr>
                <tr>
                    <th>Tên bệnh nhân</th>
                    <td><input name = "tenBenhNhan" value="<c:out value="${hoSoBenhAn.tenBenhNhan}"/>"/></td>
                </tr>
                <tr>
                    <th>Ngày nhập viện</th>
                    <td><input name = "ngayNhapVien" value="<c:out value="${hoSoBenhAn.ngayNhapVien}"/>"/></td>
                </tr>
                <tr>
                    <th>Ngày xuất viện</th>
                    <td><input name = "ngayXuatVien" value="<c:out value="${hoSoBenhAn.ngayXuatVien}"/>"/></td>
                </tr>
                <tr>
                    <th>Lý do nhập viện</th>
                    <td><input name = "lyDoNhapVien" value="<c:out value="${hoSoBenhAn.lyDoNhapVien}"/>"/></td>
                </tr>
                <tr>
                    <th>Phương pháp điều trị</th>
                    <td><input name = "phuongPhapDieuTri" value="<c:out value="${hoSoBenhAn.phuongPhapDieuTri}"/>"/></td>
                </tr>
                <tr>
                    <th>Bác sĩ điều trị</th>
                    <td><input name = "bacSiDieuTri" value="<c:out value="${hoSoBenhAn.bacSiDieuTri}"/>"/></td>
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
