<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 29/12/2020
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/benhan" method="get">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Benh An
                </h2>
            </caption>
            <c:if test="${benhAn != null}">
                <input type="hidden" name="maBenhAn" value="<c:out value='${benhAn.maBenhAn}' />"/>
            </c:if>
            <tr>
                <th>MA BENH NHAN:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${benhAn.maBenhNhan}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>TEN BENH NHAN</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${benhAn.tenBenhNhan}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>NGAY NHAP VIEN</th>
                <td>
                    <input type="text" name="country" size="15"
                           value="<c:out value='${benhAn.ngayNhapVien}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>NGAY RA VIEN</th>
                <td>
                    <input type="text" name="country" size="15"
                           value="<c:out value='${benhAn.ngayRaVien}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>LY DO NHAP VIEN</th>
                <td>
                    <input type="text" name="country" size="15"
                           value="<c:out value='${benhAn.lyDoNhapVien}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>PHUONG PHAP DIEU TRI</th>
                <td>
                    <input type="text" name="country" size="15"
                           value="<c:out value='${benhAn.phuongPhapDieuTri}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>BAC SI DIEU TRI</th>
                <td>
                    <input type="text" name="country" size="15"
                           value="<c:out value='${benhAn.bacSiDieuTri}' />"
                    />
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
