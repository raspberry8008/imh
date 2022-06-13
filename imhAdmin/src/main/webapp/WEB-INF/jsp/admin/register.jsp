<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<c:import url="../include/head.jsp"/>
<c:import url="../include/plugin_js.jsp"/>
<!-- join -->
<script src="/resources/templates/js/join.js"></script>

<body id="page-top">
 <!-- Page Wrapper -->
 <div id="wrapper">
	
	<!-- Sidebar -->
	<c:import url="../include/sidebar.jsp"/>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
			
			 <!-- Topbar -->
			 <c:import url="../include/topbar.jsp"/>

				<!-- Begin Page Content -->
				<div class="container-fluid py-3">
				
			    	<!-- Page Heading -->
				    <h6 class="m-0 font-weight-bold text-gray">관리자 &gt; 관리자 등록</h6>

					 <!-- Page  Content -->
                       <div class="card shadow-lg border-0 rounded-lg mt-5">
                           <div class="card-header py-3"> 
                           	<h3 class="font-weight-bold text-success">관리자 등록</h3>
                           </div>	
                           <div class="card-body">
                               <form action="/admin/register" id="sendForm" method="post" enctype="multipart/form-data" >
                               
								   <div class="form-group row mb-3">
								    <label for="inputid" class="col-sm-3 text-center col-form-label">아이디</label>
								    <div class="col-sm-8">
								      <input type="text" class="form-control text-center"  id="inputId" name="adminId" value="" onchange="id_chk()" value="email@example.com">
								    <div class="check_font" id="id_check"></div>
								    </div>
								  </div>
	  
                                    <div class="form-group row mb-3">
                                      <label for="inputPassword" class="col-sm-3 text-center col-form-label">비밀번호</label>
                                      <div class="col-sm-8">
                                         <input class="form-control" id="inputPwd" name="adminPwd" type="password" value="" placeholder="비밀번호" onchange="join_chk()">
                                         <div class="check_font" id="pwd_check"></div>
                                     </div>
                                   </div>
                                   
                                   <div class="form-group row mb-3">
                                      <label for="inputPwdck" class="col-sm-3 text-center col-form-label">비밀번호 확인</label>
                                       <div class="col-sm-8" >
                                         <input class="form-control" id="inputPwdck" type="password" value="" placeholder="비밀번호 확인" onchange="join_chk()">
                                         <div class="check_font" id="pwdck_check"></div>
                                     </div>
                                   </div>
                                   
                                   <div class="form-group row mb-3">
                                      <label for="inputadminDno" class="col-sm-3 text-center col-form-label">부서명</label>
                                       <div class="col-sm-8" >
                                 	      <select id="inputadminDno" name="adminDno" class="form-control">
									        <option value="">부서 선택</option>
									        <option value="개발팀">개발팀</option>
									        <option value="인사팀">인사팀</option>
									        <option value="경영지원팀">경영지원팀</option>
									        <option value="영업전략팀">영업전략팀</option>
									      </select>
                                         <div class="check_font" id="adminDno_check"></div>
                                     </div>
                                   </div>
                                    
                                   <div class="form-group row mb-3">
                                      <label for="inputEno" class="col-sm-3 text-center col-form-label">사원번호</label>
                                       <div class="col-sm-8" >
                                         <input class="form-control" id="inputEno" name="adminEno" type="text" value="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" placeholder="사원번호" onchange="eno_chk()">
                                         <div class="check_font" id="adminEno_check"></div>
                                     </div>
                                   </div>
                                   
                                   <div class="form-group row mb-3">
                                      <label for="inputName" class="col-sm-3 text-center col-form-label">이름</label>
                                       <div class="col-sm-8" >
                                         <input class="form-control" id="inputName" name="adminName" type="text" value="" placeholder="이름" onchange="join_chk()">
                                         <div class="check_font" id="name_check"></div>
                                     </div>
                                   </div>

                                   <div class="form-group row mb-3">
                                      <label for="inputBirth" class="col-sm-3 text-center col-form-label">생년월일</label>
                                       <div class="col-sm-8" >
                                         <input class="form-control" id="inputBirth" name="adminBirth" type="text" value="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" placeholder="예시: 20220501" onchange="join_chk()">
                                         <div class="check_font" id="birth_check"></div>
                                     </div>
                                   </div>
                                   
                                   <div class="form-group row mb-3">
                                      <label for="inputPhone" class="col-sm-3 text-center col-form-label">연락처</label>
                                       <div class="col-sm-8" >
                                         <input class="form-control" id="inputPhone" name="adminPhone" type="text" value="" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" placeholder="예시: 01000000000" onchange="join_chk()">
                                         <div class="check_font" id="phone_check"></div>
                                     </div>
                                   </div>
                                   
                                   <div class="form-group row mb-3">
                                      <label for="inputEmail" class="col-sm-3 text-center col-form-label">Email</label>
                                       <div class="col-sm-8" >
                                         <input class="form-control" id="inputEmail" name="adminEmail" type="email" value=""  onchange="join_chk()" placeholder="example@imh.com" onchange="join_chk()">
                                         <div class="check_font" id="email_check"></div>
                                     </div>
                                   </div>
                                   
                                   <div class="form-group row mb-3">
                                      <label for="inputEmail" class="col-sm-3 text-center col-form-label">사진등록</label>
                                       <div class="col-sm-8" >
                                         <input type="file" class="form-control-file" id="inputImage" name="uploadFile">
                                         <div class="check_font" id="file_check"></div>
                                     </div>
                                   </div>
                                   
								   <hr>
								   
                                   <div class="col text-center py-3">
                                      <button type="button" class="btn btn-outline-success col-md-3 " 
                                       onclick="location.href='<c:url value='/admin/list/admin'/>'">목록</button>
                                       <button type="button" id="saveBtn" class="btn btn-success col-md-3 "
                                       onclick='join_ch()' ><span class="icon text-white-50"><i class="fas fa-check"></i>
                                       </span>등록</button>
                                   </div>
                               </form>
                           </div>
                       </div>
                    
               </div> <!-- End Page Content -->
               
            <!-- Footer -->
            <c:import url="../include/footer.jsp"/>
			<!-- End of Footer -->
			
       </div> <!-- End of Main Content -->
   </div> <!-- End of Content Wrapper -->
</div> <!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<c:import url="../include/scrollTop_button.jsp"/>
	
</body>
</html>