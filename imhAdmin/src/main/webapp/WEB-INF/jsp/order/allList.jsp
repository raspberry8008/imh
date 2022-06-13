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
										<h6 class="m-0 font-weight-bold text-success mb-4">주문관리
											&gt; 주문조회</h6>
										<form name="search"
											action="<c:url value='/order/list/all' />" method="post"
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
															<option value="order_orderCode"
																${pageMaker.cri.condition == 'order_orderCode' ? 'selected' : ''}>주문번호</option>
															<option value="order_orderName"
																${pageMaker.cri.condition == 'order_orderName' ? 'selected' : ''}>구매자명</option>
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
													<h3>
														<span class="badge badge-pill badge-success">총
															${pageMaker.totalCount} 건</span>
													</h3>
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
												<th class="text-center" scope="col">주문번호</th>
												<th class="text-center" scope="col">상품주문번호</th>
												<th class="text-center" scope="col">주문상태</th>
												<th class="text-center" scope="col">구매자명</th>
												<th class="text-center" scope="col">주문상품</th>
												<th class="text-center" scope="col">총 상품금액</th>
												<th class="text-center" scope="col">결제금액</th>
												<th class="text-center" scope="col">결제일시</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="orderInfo" items="${list}">
												<tr>
													<td class="text-center"><a class="text-success "
														href="<c:url value='/admin/order?orderCode=${orderInfo.orderCode}&orderId=${orderInfo.orderId}'/>"
														id="orderCode">${orderInfo.orderCode}</a></td>
													<td class="text-center"><a class="text-success "
														href="<c:url value='/admin/order/item?orderItemId=${order.orderItemId}'/>"
														id="orderCode">${orderInfo.orderItemId}</a></td>
													<td class="text-center">${orderInfo.orderStateKor}</td>
													<td class="text-center">${orderInfo.orderName}</td>
													<td class="text-center">${orderInfo.orderItemName}</td>
													<td class="text-center"><fmt:formatNumber value="${orderInfo.orderItemPrice}" pattern="#,###"/>원</td>
													<td class="text-center"><fmt:formatNumber value="${orderInfo.orderTotalPrice}" pattern="#,###"/>원</td>
													<td class="text-center">${orderInfo.orderPayRegdate}</td>
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

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<c:import url="../include/scrollTop_button.jsp"/>	

</body>
</html>
