<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<c:import url="../include/head.jsp"/>
<c:import url="../include/plugin_js.jsp"/>

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
				    <h6 class="m-0 font-weight-bold text-gray">관리자 &gt; 관리자 상세조회</h6>

					 <!-- Page  Content -->
                       <div class="card shadow-lg border-0 rounded-lg mt-5">
                           <div class="card-header py-3"> 
                           	<h3 class="font-weight-bold text-success">관리자 상세조회</h3>
                           </div>	
                           <div class="card-body">
							   <div class="form-group row mb-3">
							    <div class="col-sm-12">
							      <img src="/resources/adminImg/<c:out value="${AdminVO.adminImage}"/>" class="rounded mx-auto d-block">
							    </div>
							  </div>
							  
							   <div class="form-group row mb-3">
							    <label for="inputid" class="col-sm-3 text-center mb-3">아이디</label>
							    <div class="col-sm-8 mb-3">
									<c:out value="${AdminVO.adminId}"/>
							    </div>
							  </div>
		                                
                               <div class="form-group row mb-3">
                                  <label for="inputadminDno" class="col-sm-3 text-center mb-3">부서명</label>
                                   <div class="col-sm-8 mb-3" >
                             	      <c:out value="${AdminVO.adminDno}"/>
                                 </div>
                               </div>
                                
                               <div class="form-group row mb-3">
                                  <label for="inputEno" class="col-sm-3 text-center col-form-label mb-3">사원번호</label>
                                   <div class="col-sm-8 mb-3" >
                                     <c:out value="${AdminVO.adminEno}"/>
                                 </div>
                               </div>
                               
                               <div class="form-group row mb-3">
                                  <label for="inputName" class="col-sm-3 text-center mb-3">이름</label>
                                   <div class="col-sm-8 mb-3" >
                                     <c:out value="${AdminVO.adminName}"/>
                                 </div>
                               </div>

                               <div class="form-group row mb-3">
                                  <label for="inputBirth" class="col-sm-3 text-center mb-3">생년월일</label>
                                   <div class="col-sm-8 mb-3" >
                                     <c:out value="${AdminVO.adminBirth}"/>
                                 </div>
                               </div>
                               
                               <div class="form-group row mb-3">
                                  <label for="inputPhone" class="col-sm-3 text-center mb-3">연락처</label>
                                   <div class="col-sm-8 mb-3" >
                                     <c:out value="${AdminVO.adminPhone}"/>
                                 </div>
                               </div>
                               
                               <div class="form-group row mb-3">
                                  <label for="inputEmail" class="col-sm-3 text-center mb-3">Email</label>
                                   <div class="col-sm-8 mb-3" >
                                     <c:out value="${AdminVO.adminEmail}"/>
                                 </div>
                               </div>
		
							   <hr>
							   
                               <div class="col text-center py-3">
                                  <button type="button" class="btn btn-outline-success col-md-3 " 
                                   onclick="location.href='<c:url value='/admin/list/admin'/>'">목록</button>
                                   <button type="button" id="saveBtn" class="btn btn-success col-md-3 "
                                   onclick="location.href='<c:url value='/admin/update/admin?adminId=${AdminVO.adminId}'/>'" ><span class="icon text-white-50"><i class="fas fa-check"></i>
                                   </span>수정</button>
                               </div>
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