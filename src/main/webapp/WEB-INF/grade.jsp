<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CE190990_WS1_02</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    </head>
    <body>
        <center>
            <h2 class="mb-3 mt-5">BẢNG ĐIỂM SINH VIÊN</h2>
        </center>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th class="bg-dark text-white">Mã SV</th>
                    <th class="bg-dark text-white">Họ tên</th>
                    <th class="bg-dark text-white">Khoa</th>
                    <th class="bg-dark text-white">Môn học</th>
                    <th class="bg-dark text-white">Số tín chỉ</th>
                    <th class="bg-dark text-white">Điểm</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${list}">
                    <tr>
                        <td>${item.getStudent().getStudentID()}</td>
                        <td>${item.getStudent().getFullName()}</td>
                        <td>${item.getStudent().getDepartment().getDepartmentName()}</td>
                        <td>${item.getSubject().getSubjectName()}</td>
                        <td>${item.getSubject().getCredit()}</td>
                        <td>${item.getScore()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
