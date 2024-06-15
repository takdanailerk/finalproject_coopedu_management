<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/6/2567
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container">
    <h2>List of RequestForm</h2>
    <table border="1">
        <tr>
            <th>ลำดับที่</th>
            <th>ประเภทการปฎิบัติงาน</th>
<%--            <th>สาขา</th>--%>
<%--            <th>รายชื่อนักศึกษา</th>--%>
            <th>ชื่อสถานประกอบการ</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="coop_education" items="${coop_educations}">
            <tr>
                <td>${coop_education.coopEduId}</td>
                <td>${coop_education.coopEduType}</td>
<%--                <td>${coop_educate.majorId}</td>--%>
<%--                <td>${coop_education.Student.studentName}</td>--%>
                <td>${coop_education.company.companyName}</td>
                <td>
                    <a href="edit-request-form/${coop_education.coopEduId}">Edit</a>
                    <a href="delete-request-form/${coop_education.coopEduId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="request-form">Add New RequestForm</a>

</div>
<%@include file="footer.jsp" %>
</body>
</html>
