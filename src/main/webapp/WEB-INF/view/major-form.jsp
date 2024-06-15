<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 9/6/2567
  Time: 1:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<%@include file="navbar.jsp" %>
<form action="${pageContext.request.contextPath}/majors-form-submit" method="post" class="form-horizontal">
    <div class="container">
        <div class="form-group row mb-3">
            <div class="col-sm-5 control-label ">เพิ่มข้อมูล สาขา .</div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">ชื่อสาขา :</div>
            <div class="col-sm-3">
                <input type="text" name="majorName" required class="form-control" minlength="2" placeholder="ชื่อ สาขา">
            </div>
            <div class="col-sm-1 control-label">โทรศัพท์ :</div>
            <div class="col-sm-3">
                <input type="text" name="majorPhoneNo" required class="form-control" minlength="2" placeholder="โทรศัพท์">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">โทรสาร :</div>
            <div class="col-sm-3">
                <input type="text" name="majorFax" required class="form-control" minlength="2" placeholder="โทรสาร">
            </div>
            <div class="col-sm-1 control-label">อีเมล์ :</div>
            <div class="col-sm-3">
                <input type="email" name="majorEmail" required class="form-control" minlength="2" placeholder="อีเมล์">
            </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-2">
            </div>
            <div class="col-sm-3">
                <button type="submit" class="btn btn-primary">บันทึก</button>
            </div>
        </div>

    </div>
</form>
<%@include file="footer.jsp" %>
</body>


</html>
