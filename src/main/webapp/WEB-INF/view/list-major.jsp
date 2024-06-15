<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/6/2567
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container">
    <h2>List of Majors</h2>
    <table border="1">
        <tr>
            <th>Major ID</th>
            <th>Major Name</th>
            <th>Phone No</th>
            <th>Fax</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
    <c:forEach var="major" items="${majors}">
        <tr>
            <td>${major.majorId}</td>
            <td>${major.majorName}</td>
            <td>${major.majorPhoneNo}</td>
            <td>${major.majorFax}</td>
            <td>${major.majorEmail}</td>
            <td>
                <a href="edit-major/${major.majorId}">Edit</a>
                <a href="delete-major/${major.majorId}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </table>
    <a href="major-form">Add New Major</a>

</div>
<%@include file="footer.jsp" %>
</body>
</html>
