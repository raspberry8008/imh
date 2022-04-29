<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<%@ include file="../include/head.jsp"%>
<%@ include file="../include/plugin_js.jsp"%>
<body id="page-top">
	<!-- Page Wrapper -->
	<div id="wrapper">
		<!-- Sidebar -->
		<%@ include file="../include/sidebar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
				<!-- Topbar -->
				<%@ include file="../include/topbar.jsp"%>

				<!-- Begin Page Content -->
				<div class="container-fluid">


					<!-- Page Heading -->


					<!-- DataTales -->
					 <div class="colmb-4 mb-4">
                            <div class="card border-left-success shadow h-100 py-2">
                                <div class="card-body">
                                     <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                             <h6 class="m-0 font-weight-bold text-success mb-4"> 주문관리 &gt; 주문조회 &gt;  주문 상세 조회</h6>
                           
                                           
                                        </div>
                                    
                                </div>
                                    <div class="table-responsive">
                                <table class="table table-hover">
										<thead>
											<tr>
												<td class="text-center" scope="col">주문번호</td>
												<td class="text-center" scope="col">주문상태</td>
												<td class="text-center" scope="col">구매자명</td>
												<td class="text-center" scope="col">주문상품</td>
												<td class="text-center" scope="col">상품금액</td>
												<td class="text-center" scope="col">결제금액</td>
												<td class="text-center" scope="col">결제일시</td>
												<td class="text-center" scope="col">주문확인처리</td>
												<td class="text-center" scope="col">주문취소</td>
											</tr>
										</thead>
										<tbody>
												<tr>
						
													<td class="text-center" ><a class="text-success "
													 href="<c:url value='/order/read?orderCode=${order.orderCode}'/>" id="orderCode">${order.orderCode}</a></td>
													<td class="text-center" >${order.orderState}</td>
													<td class="text-center">${order.orderName}</td>
													<td class="text-center">${order.productName}</td>
													<td class="text-center">${order.amountTotal}원</td>
													<td class="text-center">${order.payPrice}원</td>
													<td class="text-center">${order.payDate}</td>
													<td class="text-center"><button type="button" class="btn btn-outline-success"  id="orderCheck" value="'3'">주문확인</button></td>
													<td class="text-center"><button type="submit" class="btn btn-outline-danger">주문취소</button></td>
												</tr>
										</tbody>
									</table>
									<!-- page nav -->
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
			<%@ include file="../include/footer.jsp"%>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<%@ include file="../include/scrollTop_button.jsp"%>

</body>




</html>
