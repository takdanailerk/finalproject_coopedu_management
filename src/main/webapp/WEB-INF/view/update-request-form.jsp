<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/6/2567
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<%@include file="navbar.jsp" %>

<form:form modelAttribute="coop_educations" action="${pageContext.request.contextPath}/update-request-form/${id}" method="post">
    <div class="container ">
        <div class="form-group row mb-3">
            <h2>Edit RequestForm</h2>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">สาขาวิชา :</div>
            <div class="col-sm-3">
                <select name="majorId">
                    <c:forEach var="major" items="${majors}">
                        <option value="${major.majorId}" <c:if test="${major.majorId eq coop_educations.major.majorId}">selected</c:if>>${major.majorName}</option>
                    </c:forEach>

                </select>
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-5 control-label ">ข้อมูลสถานประกอบการ.</div>
        </div>
<%--        <div class="form-group row mb-3">--%>
<%--            <div class="col-sm-2 control-label">ชื่อ :</div>--%>
<%--            <div class="col-sm-3">--%>
<%--                <form:input path="companyName"/>--%>
<%--            </div>--%>
<%--            <div class="col-sm-1 control-label">โทรศัพท์ :</div>--%>
<%--            <div class="col-sm-3">--%>
<%--                <form:input path="majorPhoneNo"/>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="form-group row mb-3">--%>
<%--            <div class="col-sm-2 control-label">Fax :</div>--%>
<%--            <div class="col-sm-3">--%>
<%--                <form:input path="majorFax"/>--%>
<%--            </div>--%>
<%--            <div class="col-sm-1 control-label">Email :</div>--%>
<%--            <div class="col-sm-3">--%>
<%--                <form:input path="majorEmail"/>--%>
<%--            </div>--%>
<%--        </div>--%>
        <div class="form-group row mb-3">
            <div class="col-sm-3">
                <button type="submit" value="update">บันทึก</button>
            </div>
        </div>
    </div>

</form:form>
<%@include file="footer.jsp" %>
</body>
</html>
