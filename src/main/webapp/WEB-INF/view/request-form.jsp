<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 31/5/2567
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<%@include file="navbar.jsp" %>
<form action="${pageContext.request.contextPath}/request-form-submit" method="post" class="form-horizontal">
    <div class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="alert alert-danger" role="alert" >
                    <h2 name="coopEduType" value="ขอความอนุเคราะห์">ฟอร์มขอความอนุเคราะห์ฝึกงานและสหกิจศึกษา </h2>
                </div>
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-5 control-label text-danger">*ยังไม่มีใบตอบรับจากสถานประกอบการให้กรอกฟอร์มนี้*</div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-4 control-label">หลักสูตร : วิทยาศาสตร์ บัณฑิต </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">
                สาขาวิชา :
            </div>
            <div class="col-sm-3">
                <select name="majorId">
                    <c:forEach var="major" items="${majors}">
                        <option value="${major.majorId}">
                                ${major.majorName}
                        </option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">
                ประเภทการปฎิบัติงาน :
            </div>
            <div class="form-check col-sm-1">
                <input class="form-check-input" type="radio" name="coopEduType" id="flexRadio1" value="ฝึกงาน" checked>
                <label class="form-check-label" for="flexRadio1">ฝึกงาน</label>
            </div>
            <div class="form-check col-sm-2">
                <input class="form-check-input" type="radio" name="coopEduType" id="flexRadio2" value="สหกิจศึกษา" >
                <label class="form-check-label" for="flexRadio2">สหกิจศึกษา</label>
            </div>
            <div class="col-sm-1 control-label">
                ปีการศึกษา :
            </div>
            <div class="col-sm-1">
                <select name="coopEduYear" class="form-select" required>
                    <option value="2567">2567</option>
                    <option value="2566">2566</option>
                    <option value="2565">2565</option>
                    <option value="2564">2564</option>
                    <option value="2563">2563</option>
                </select>
            </div>
            <div class="col-sm-1 control-label">
                ถาคเรียนที่ :
            </div>
            <div class="col-sm-1">
                <select name="coopEduSemester" class="form-select" required>
                    <option value="1">1</option>
                    <option value="2">2</option>
                </select>
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">ระยะเวลาตั้งแต่วันที่เริ่ม</div>
            <div class="col-sm-2">
                <input type="date" name="startDate" date-provide="datepicker"  required class="form-control"  placeholder="เลือกวันที่">
            </div>
            <div class="col-sm-1 control-label">ถึงวันที่กลับ</div>
            <div class="col-sm-2">
                <input type="date" name="endDate" date-provide=" datepicker"  required class="form-control" placeholder="เลือกวันที่">
            </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-5 control-label ">ข้อมูลสถานประกอบการ.</div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">ชื่อ :</div>
            <div class="col-sm-3">
                <input type="text" name="companyName" required class="form-control" minlength="2" placeholder="ชื่อสถานประกอบการ">
            </div>
            <div class="col-sm-1 control-label">ที่อยู่ :</div>
            <div class="col-sm-3">
                <textarea type="text" name="companyAddress" required class="form-control" minlength="2" placeholder="ที่อยู่"></textarea>
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">เบอร์โทร :</div>
            <div class="col-sm-3">
                <input type="text" name="companyPhoneNo" required class="form-control" minlength="2" placeholder="เบอร์โทร">
            </div>
            <div class="col-sm-1 control-label">อีเมล์ :</div>
            <div class="col-sm-3">
                <input type="email" name="companyEmail" required class="form-control" minlength="2" placeholder="อีเมล์">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">Facebook :</div>
            <div class="col-sm-3">
                <input type="text" name="companyFacebook" required class="form-control" minlength="2" placeholder="facebook">
            </div>
            <div class="col-sm-1 control-label">Line :</div>
            <div class="col-sm-3">
                <input type="text" name="companyLine" required class="form-control" minlength="2" placeholder="line">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">ชื่อผู้ประสานงาน :</div>
            <div class="col-sm-3">
                <input type="text" name="coordinatorName" required class="form-control" minlength="2" placeholder="ชื่อ">
            </div>
            <div class="col-sm-1 control-label">เบอร์โทร :</div>
            <div class="col-sm-3">
                <input type="text" name="coordinatorPhoneNo" required class="form-control" minlength="2" placeholder="เบอรโทร">
            </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-5 control-label ">ข้อมูลนักศึกษา.</div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">ชื่อนักศึกษา :</div>
            <div class="col-sm-3">
                <input type="text" name="studentName" required class="form-control" minlength="2" placeholder="ชื่อ">
            </div>
            <div class="col-sm-1 control-label">นามสกุล :</div>
            <div class="col-sm-3">
                <input type="text" name="studentLastname" required class="form-control" minlength="2" placeholder="นามสกุล">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label" class="form-control" >รหัสนักศึกษา :</div>
            <div class="col-sm-3">
                <input type="text" name="studentId" required minlength="1" maxlength="10" class="form-control"  placeholder="รหัสนักศึกษา">
            </div>
            <div class="col-sm-1 control-label">เบอร์โทร :</div>
            <div class="col-sm-3">
                <input type="text" name="studentPhoneNo" required class="form-control"  placeholder="เบอร์มือถือ" maxlength="15">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">อีเมล์ :</div>
            <div class="col-sm-3">
                <input type="email" name="studentEmail" required class="form-control"  placeholder="email">
            </div>
<%--            <div class="col-sm-2 control-label">อัปโหลด cv/transcript :</div>--%>
<%--            <div class="col-sm-3">--%>
<%--                <input type="file" id="pdf" name="rsm_pdf" required accept=".pdf">--%>
<%--            </div>--%>
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
