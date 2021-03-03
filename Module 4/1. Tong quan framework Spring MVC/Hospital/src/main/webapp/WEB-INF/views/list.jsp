<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <title>List</title>
</head>
<body>
<div class="container-fluid">
    <h2 style="text-align: center">DANH SÁCH HỒ SƠ BỆNH ÁN</h2>
    <form action="/list" method="GET">
        <div class="table-responsive">
            <table class="table table-bordered table-hover table-sm">
                <thead>
                <tr class="table-primary">
                    <th>MÃ BỆNH ÁN</th>
                    <th>MÃ BỆNH NHÂN</th>
                    <th>TÊN BỆNH NHÂN</th>
                    <th>NGÀY NHẬP VIỆN</th>
                    <th>NGÀY XUẤT VIỆN</th>
                    <th>LÝ DO NHẬP VIỆN</th>
                    <th>PHƯƠNG PHÁP ĐIỀU TRỊ</th>
                    <th>BÁC SĨ ĐIỀU TRỊ</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="hoSoBenhAn" items="${HoSoBenhAnList}">
                    <tr>
                        <td scope="row"><c:out value="${hoSoBenhAn.maBenhAn}"/></td>
                        <td><c:out value="${hoSoBenhAn.maBenhNhan}"/></td>
                        <td><c:out value="${hoSoBenhAn.tenBenhNhan}"/></td>
                        <td><c:out value="${hoSoBenhAn.ngayNhapVien}"/></td>
                        <td><c:out value="${hoSoBenhAn.ngayXuatVien}"/></td>
                        <td><c:out value="${hoSoBenhAn.lyDoNhapVien}"/></td>
                        <td><c:out value="${hoSoBenhAn.phuongPhapDieuTri}"/></td>
                        <td><c:out value="${hoSoBenhAn.bacSiDieuTri}"/></td>
                        <td>
                            <a href="/benhAnById/${hoSoBenhAn.maBenhNhan}"
                               class="btn btn-primary btn-sm" role="button">EDIT</a>
                            <a href="/delete/${hoSoBenhAn.maBenhNhan}"
                               class="btn btn-danger btn-sm" role="button">DELETE</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </form>
</div>
<script src="../../bootstrap/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</body>
</html>
