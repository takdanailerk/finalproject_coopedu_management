<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 31/5/2567
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<%@include file="home.jsp" %>

<form action="" method="post" class="form-horizontal" enctype="multipart/form-data">
    <div class="container ">
        <div class="row">
            <div class="col-md-12">
                <div class="alert alert-danger" role="alert" >
                    <h2>ฟอร์มขอความอนุเคราะห์ฝึกงานและสหกิจศึกษา  </h2>
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
            <div class="col-sm-1 control-label">
                สาขาวิชา :
            </div>
            <div class="col-sm-3">
                <select name="club_id" class="form-control" required>
                    <option value="">เลือกสาขาวิชา</option>
                    <option value="1">สาขาวิชาวิทยาการคอมพิวเตอร์</option>
                    <option value="2">สาขาวิชาเทคโนโลยีชีวภาพ</option>
                    <option value="3">สาขาวิชาเคมี</option>
                    <option value="4">สาขาวิชาสถิติ</option>
                    <option value="5">สาขาวิชาเทคโนโลยีสารสนเทศ</option>
                    <option value="6">สาขาวิชาคณิตศาสตร์</option>
                    <option value="7">สาขาวิชาวัสดุศาสตร์</option>
                    <option value="8">สาขาวิชาเคมีอุตสาหกรรมและเทคโนโลยีสิ่งทอ</option>
                    <option value="9">สาขาวิชาฟสิกส์ประยุกต์</option>
                </select>
            </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">
                ประเภทการปฎิบัติงาน :
            </div>
            <div class="form-check col-sm-1">
                <input class="form-check-input" type="radio" name="type_coop" id="flexRadioDefault1" checked>
                <label class="form-check-label" for="flexRadioDefault1">ฝึกงาน</label>
            </div>
            <div class="form-check col-sm-2">
                <input class="form-check-input" type="radio" name="type_coop" id="flexRadioDefault2" >
                <label class="form-check-label" for="flexRadioDefault2">สหกิจศึกษา</label>
            </div>
            <div class="col-sm-1 control-label">
                ปีการศึกษา :
            </div>
            <div class="col-sm-1">
                <select name="club_id" class="form-control" required>
                    <option value="">เลือก</option>
                    <option value="1">2567</option>
                    <option value="2">2566</option>
                    <option value="3">2565</option>
                    <option value="4">2564</option>
                    <option value="5">2563</option>
                </select>
            </div>
            <div class="col-sm-1 control-label">
                ถาคเรียนที่ :
            </div>
            <div class="col-sm-1">
                <select name="club_id" class="form-control" required>
                    <option value="1">1</option>
                    <option value="2">2</option>
                </select>
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">ระยะเวลาตั้งแต่วันที่เริ่ม</div>
            <div class="col-sm-2">
                <input type="date" name="start_date" date-provide="datepicker"  required class="form-control"  placeholder="เลือกวันที่">
            </div>
            <div class="col-sm-1 control-label">ถึงวันที่กลับ</div>
            <div class="col-sm-2">
                <input type="date" name="end_date" date-provide=" datepicker"  required class="form-control" placeholder="เลือกวันที่">
            </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-5 control-label ">ข้อมูลสถานประกอบการ.</div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-2 control-label">ชื่อสถานประกอบการ :</div>
            <div class="col-sm-3">
                <input type="text" name="cpn_name" required class="form-control" minlength="2" placeholder="ชื่อสถานประกอบการ">
            </div>
            <div class="col-sm-1 control-label">ที่อยู่ :</div>
            <div class="col-sm-3">
                <input type="text-arae" name="cpn_address" required class="form-control" minlength="2" placeholder="ที่อยู่">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">เบอร์โทร :</div>
            <div class="col-sm-3">
                <input type="text" name="cpn_tellophone" required class="form-control" minlength="2" placeholder="เบอร์โทร">
            </div>
            <div class="col-sm-1 control-label">อีเมล์ :</div>
            <div class="col-sm-3">
                <input type="email" name="cpn_email" required class="form-control" minlength="2" placeholder="อีเมล์">
            </div>
        </div>

        <div class="form-group row mb-3">
            <div class="col-sm-5 control-label ">ข้อมูลนักศึกษา.</div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">ชื่อนักศึกษา :</div>
            <div class="col-sm-3">
                <input type="text" name="std_name" required class="form-control" minlength="2" placeholder="ชื่อ">
            </div>
            <div class="col-sm-1 control-label">นามสกุล :</div>
            <div class="col-sm-3">
                <input type="text" name="std_lastname" required class="form-control" minlength="2" placeholder="นามสกุล">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label" class="form-control" >รหัสนักศึกษา :</div>
            <div class="col-sm-3">
                <input type="text" name="std_code" required minlength="1" maxlength="10" class="form-control"  placeholder="รหัสนักศึกษา">
            </div>
            <div class="col-sm-1 control-label">เบอร์โทร :</div>
            <div class="col-sm-3">
                <input type="text" name="std_phone" required class="form-control"  placeholder="เบอร์มือถือ" maxlength="15">
            </div>
        </div>
        <div class="form-group row mb-3">
            <div class="col-sm-1 control-label">อีเมล์ :</div>
            <div class="col-sm-3">
                <input type="email" name="std_email" required class="form-control"  placeholder="email">
            </div>
            <div class="col-sm-2 control-label">อัปโหลด cv/transcript :</div>
            <div class="col-sm-3">
                <input type="file" id="pdf" name="rsm_pdf" required accept=".pdf">
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
</body>
</html>
