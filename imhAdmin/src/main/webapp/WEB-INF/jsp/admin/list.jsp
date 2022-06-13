<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="true"%>
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
				<div class="container-fluid">


					<!-- Page Heading -->


					<!-- DataTales -->
					<div class="colmb-4 mb-4">
						<div class="card border-left-success shadow h-100 py-2">
							<div class="card-body">
								<div class="row no-gutters align-items-center">
									<div class="col mr-2">
										<h6 class="m-0 font-weight-bold text-success mb-4">관리자
											&gt; 목록조회</h6>
										<form name="search"
											action="<c:url value='/admin/list' />" method="post"
											class="form-horizontal">
											<input type="hidden" name="page"
												value="${pageMaker.cri.page}"> <input type="hidden"
												name="perPageNum" value="${pageMaker.cri.perPageNum}">
											<!-- 주문상태 -->
											<div class="row align-items-start">
												<div class="col-auto">
													<div class="input-group form-group">
														<select class="form-control" id="id_condition"
															name="condition">
															<option selected>상세조회 전체</option>
															<option value="admin_adminName"
																${pageMaker.cri.condition == 'admin_adminName' ? 'selected' : ''}>이름</option>
															<option value="admin_adminEno"
																${pageMaker.cri.condition == 'admin_adminEno' ? 'selected' : ''}>사원번호</option>
															<option value="admin_adminState"
																${pageMaker.cri.condition == 'admin_adminState' ? 'selected' : ''}>계정상태(Y/N)</option>
														</select> <input type="text" name="keyword"
															class="form-control search-input"
															value="${pageMaker.cri.keyword}">
													</div>
												</div>
												<div class="col-auto ">
													<div class="input-group form-group">

														<button type="submit" class="btn btn-success search-btn">
															<i class="fa fa-search"></i> &nbsp;&nbsp;검 색
														</button>
													</div>
												</div>
											</div>

											<div class="form float-right mb-4">
												<div class="col form-inline">
													<div class="col">
														<div class="form-group">
															<div class="item select-form">
																<select id="id_perPageNum" name="perPageNum"
																	class="form-control input-sm">
																	<option selected>row</option>
																	<option value="5"
																		${pageMaker.cri.page== perPageNum ? selected : 5}>5개</option>
																	<option value="10"
																		${pageMaker.cri.page== perPageNum ? selected : 10}>10
																		개</option>
																	<option value="20"
																		${pageMaker.cri.page== perPageNum ? selected : 20}>20
																		개</option>
																</select>
															</div>
														</div>
													</div>

												</div>
											</div>
										</form>

									</div>

								</div>
								<div class="table-responsive">
									<table class="table table-hover">
										<thead>
											<tr>
												<th class="text-center" scope="col">부서명</th>
												<th class="text-center" scope="col">사원번호</th>
												<th class="text-center" scope="col">아이디</th>
												<th class="text-center" scope="col">이름</th>
												<th class="text-center" scope="col">생년월일</th>
												<th class="text-center" scope="col">연락처</th>
												<th class="text-center" scope="col">등록일자</th>
												<th class="text-center" scope="col">계정상태</th>
												<th class="text-center" scope="col">상세조회</th>
												<th class="text-center" scope="col">수정</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="AdminVO" items="${list}">
												<tr>
													<td class="text-center"><c:out value="${AdminVO.adminDno}"/></td>
													<td class="text-center"><c:out value="${AdminVO.adminEno}"/></td>
													<td class="text-center"><c:out value="${AdminVO.adminId}"/></td>
													<td class="text-center"><c:out value="${AdminVO.adminName}"/></td>
													<td class="text-center"><c:out value="${AdminVO.adminBirth}"/></td>
													<td class="text-center"><c:out value="${AdminVO.adminPhone}"/></td>
													<td class="text-center">
													<fmt:parseDate value="${AdminVO.adminJoindate}" pattern="yyyy-MM-dd HH:mm:ss" var="date"/>
													<fmt:formatDate pattern="yyyy년MM월dd일" type="both" value="${date}" />
													</td>
													<td class="text-center"><c:out value="${AdminVO.adminState}"/></td>
													<td class="text-center">
														<button type="button" class="btn btn-outline-success"
														onclick="location.href='<c:url value='/admin/detail?adminId=${AdminVO.adminId}'/>'">상세조회</button>
													</td>
													<td class="text-center">
														<button type="button" class="btn btn-outline-warning"
														onclick="location.href='<c:url value='/admin/update/admin?adminId=${AdminVO.adminId}'/>'">수정</button>
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
									
									<!-- page nav -->
									<%@ include file="../include/pagenav_js.jsp"%>
									

								</div>
							</div>
						</div>
					</div>
					<!-- DataTales end-->

					<!-- end Page Content -->
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<c:import url="../include/footer.jsp"/>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div><!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<c:import url="../include/scrollTop_button.jsp"/>

</body>
</html>
