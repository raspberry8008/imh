<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<%@ include file="../include/head.jsp" %>
<%@ include file="../include/plugin_js.jsp" %>
<script type="text/javascript">
/*이동 페이지 경로*/
function page(idx){
  var pagenum = idx;
  var perPageNum = $("#perPageNum option:selected").val();

  if(perPageNum == 10){
    location.href="${pageContext.request.contextPath}/admin/list?page="+pagenum+"&perPageNum="+perPageNum

  }else if(perPageNum == 20){
    location.href="${pageContext.request.contextPath}/admin/list?page="+pagenum+"&perPageNum="+perPageNum

  }else if(perPageNum == 30){
    location.href="${pageContext.request.contextPath}/admin/list?page="+pagenum+"&perPageNum="+perPageNum

  }
}
</script>

<body id="page-top">
  <!-- Page Wrapper -->
   <div id="wrapper">
      <!-- Sidebar -->
      <%@ include file="../include/sidebar.jsp" %>
      
       <!-- Content Wrapper -->
       <div id="content-wrapper" class="d-flex flex-column">
        <!-- Main Content -->
        <div id="content">
        
        <!-- Topbar -->
  		<%@ include file="../include/topbar.jsp" %>
               
              <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">관리자 > 조회</h1>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
                        </div>
                        <!-- 한 페이지당 보여지는 데이터 수 -->
					<div>
				    <select name="perPageNum" id="perPageNum" onchange="page(1)">
				      <option value="10" <c:if test="${pageMaker.cri.page==10}">selected="selected"</c:if> >10 개</option>
				      <option value="20" <c:if test="${pageMaker.cri.page==20}">selected="selected"</c:if> >20 개</option>
				      <option value="30" <c:if test="${pageMaker.cri.page==30}">selected="selected"</c:if> >30 개</option>
				    </select> 
					</div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" 
                                width="100%" cellspacing="0">
     
							<tr>
								<td>글번호</td>
								<td>제목</td>
								<td>작성일</td>
								<td>작성자</td>
								<td>조회수</td>
							</tr>
                                     <c:forEach var="admin" items="${list}">
                                         <tr>
												<td>
													<div class="form-check">
														<div class="custom-control custom-checkbox small">
															<input class="form-check-input" type="checkbox" value=""
																id="flexCheckDefault" value="${admin.adminId}">
														</div>
													</div>
												</td>

												<td><a
													href="${pageContext.request.contextPath}/admin/read?&adminId=${admin.adminEno}"
													class="text-decoration-none text-dark">
														${admin.adminEno} </a></td>
												<td><a
													href="${pageContext.request.contextPath}/admin/read?&adminId=${admin.adminName}"
													class="text-decoration-none text-dark">
														${admin.adminName} </a></td>
												<td>${admin.adminBirth}</td>
												<td>${admin.adminPhone}</td>
								
											</tr>
											</c:forEach>
               
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->
                <!-- 게시판 하단의 페이징 버튼 -->
					<div class="container">
						<div class="d-flex justify-content-center">
							<nav class="d-flex justify-content-center justify-content-md-end">
								<ul class="pagination justify-content-center">
									<li class="page-item"><c:if test="${pageMaker.prev}">
											<a class="page-link link-dark page-link-arrow"
												href="javascript:page(${pageMaker.getStartPage()-1});">
												<i class="bi bi-caret-left-fill"></i>
											</a>
										</c:if></li>
									<c:forEach begin="${pageMaker.getStartPage()}" end="${pageMaker.getEndPage()}" var="idx">
										<li class="page-item">
										<a class="page-link link-dark" href="javascript:page(${idx});">${idx}</a></li>
									</c:forEach>
									<li class="page-item">
									<c:if test="${pageMaker.next}">
											<a class="page-link link-dark page-link-arrow" href="javascript:page(${pageMaker.getEndPage()+1});">
											<i class="bi bi-caret-right-fill"></i></a>
									</c:if>
									</li>
								</ul>
							</nav>
						</div>
					</div>

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <%@ include file="../include/footer.jsp" %>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <%@ include file="../include/scrollTop_button.jsp" %>


</body>

  
</html>
