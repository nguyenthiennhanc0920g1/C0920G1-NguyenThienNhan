<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit</title>
</head>
<body>
<form action="/editBenhAnChiTiet" method="POST" modelAttribute="editBenhAn">
    <table class="table">
        <c:if test="${benhAn != null}">
            <input type="hidden" name="maBenhAn" value="<c:out value='${benhAn.maBenhAn}'/>"/>
        </c:if>
        <tr>
            <th>MÃ BỆNH ÁN</th>
            <td><input  name="bacsi" value="<c:out value='${benhAn.bacSiDieuTri}'/>"/></td>
        </tr>
    </table>
</form>
</body>
</html>
